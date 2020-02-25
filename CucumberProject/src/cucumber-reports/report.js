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
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\MyDriver\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.utility.DriverUtility.getDriver(DriverUtility.java:18)\r\n\tat sceleton.LoginStepDefinitions1.the_URL_of_demo_web_shop_application(LoginStepDefinitions1.java:20)\r\n\tat ✽.The URL of demo web shop(file:src/test/resources/sceleton/login1.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters kannan1@gmail.com as admin username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\MyDriver\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.utility.DriverUtility.getDriver(DriverUtility.java:18)\r\n\tat sceleton.LoginStepDefinitions1.the_URL_of_demo_web_shop_application(LoginStepDefinitions1.java:20)\r\n\tat ✽.The URL of demo web shop(file:src/test/resources/sceleton/login1.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters kannan2@gmail.com as guest username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\MyDriver\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.utility.DriverUtility.getDriver(DriverUtility.java:18)\r\n\tat sceleton.LoginStepDefinitions1.the_URL_of_demo_web_shop_application(LoginStepDefinitions1.java:20)\r\n\tat ✽.The URL of demo web shop(file:src/test/resources/sceleton/login1.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters kannan3@gmail.com as vendor username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters test1234 as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions1.user_is_in_valid_page()"
});
formatter.result({
  "status": "skipped"
});
});