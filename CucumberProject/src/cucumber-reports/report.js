$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sceleton/login1.feature");
formatter.feature({
  "name": "Login Feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "A valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo web shop",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e as \u003ctype\u003e username",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \u003cpassword\u003e as password",
  "keyword": "When "
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "type"
      ]
    },
    {
      "cells": [
        "kannan1@gmail.com",
        "test1234",
        "admin"
      ]
    },
    {
      "cells": [
        "kannan2@gmail.com",
        "test1234",
        "guest"
      ]
    },
    {
      "cells": [
        "kannan3@gmail.com",
        "test1234",
        "vendor"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions1.the_URL_of_demo_web_shop_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters kannan1@gmail.com as admin username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "A valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions1.the_URL_of_demo_web_shop_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters kannan2@gmail.com as guest username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "A valid login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions1.the_URL_of_demo_web_shop_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters kannan3@gmail.com as vendor username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
});