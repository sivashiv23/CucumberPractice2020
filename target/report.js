$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/Login.feature");
formatter.feature({
  "name": "To test the Login functionality in Facebook",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login with valid test data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user should load the facebook URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.LoginStep.the_user_should_load_the_facebook_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should give the valid username",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.LoginStep.the_user_should_give_the_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should give the valid password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.LoginStep.the_user_should_give_the_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click on the  login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.LoginStep.the_user_should_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successfully logged in page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.LoginStep.successfully_logged_in_page()"
});
formatter.result({
  "status": "passed"
});
});