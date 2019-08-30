$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\User\\GULSUM\\NextBasecrm\\src\\test\\resource\\features\\login\\Login.feature");
formatter.feature({
  "name": "As user I want to login under different roles",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VYT-4121"
    }
  ]
});
formatter.scenario({
  "name": "Verify warning message for invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VYT-4121"
    },
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user logs in with \"wrong\" username and \"wrong\" password",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies that \"Incorrect login or password\" warning message is displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});