$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AddToCartPage.feature");
formatter.feature({
  "name": "Add to cart functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Not a validated user",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.not_a_valideted_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.User_browse_to_the_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Spree home page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.spree_home_page_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "1.User Add the product to shopping cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click the bags categories link",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartPageSteps.user_click_the_bags_categories_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Bags categories page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartPageSteps.bags_categories_page_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select ruby on rails bag item",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartPageSteps.user_select_buby_on_rails_bag_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ruby on rails bag page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartPageSteps.buby_on_rails_bag_page_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select the quantity",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartPageSteps.user_select_the_quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartPageSteps.click_the_add_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});