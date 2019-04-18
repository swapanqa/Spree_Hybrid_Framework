package com.spree_ecommerce.hybrid.cucumber.framework.utils;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 6:09 PM
 */
public class LinkConnectionUtils extends UtilsController {

    public LinkConnectionUtils(WebDriver driver) {
        super(driver);
    }

    public void verifyLinkStatus(String fileLocation, int rowNumber, String linkUrl, String excelSheetName){
        try
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();  //To open the connection
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode() == 200){   //Code 200 means connections is fine (Link NOT Broken)
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
                writeToExcel(fileLocation, excelSheetName, rowNumber, linkUrl.toString(), httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND){
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
                writeToExcel(fileLocation, excelSheetName, rowNumber, linkUrl.toString(), httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToExcel(String fileLocation, String sheetName, int rowNumber, String link, String result) {
        File file = new File(fileLocation);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            sheet.createRow(rowNumber).createCell(0).setCellValue(link);
            sheet.getRow(rowNumber).createCell(1).setCellValue(result);

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
