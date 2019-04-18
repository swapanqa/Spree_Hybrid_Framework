package com.spree.analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Debajyoti Paul on 5/15/2018 at 10:35 PM
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    int count = 0;
    int retry = 1;

    // As of now, just want to retry my failed test cases only once.
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<retry){
            count++;
            return true;
        }
        return false;
    }

}
