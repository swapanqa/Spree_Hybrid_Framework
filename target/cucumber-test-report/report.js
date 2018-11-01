$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HomePage.feature");
formatter.feature({
  "name": "Spree home page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
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
formatter.step({
  "name": "All links are not broken",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.all_links_are_not_broken()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});