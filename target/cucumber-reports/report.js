$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestSite.feature");
formatter.feature({
  "line": 2,
  "name": "Test the APIs and check the data is correctly displayed",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Validate user can be created",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-created",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user invoke the api for users",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user will get 201 response",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will see all the users",
  "keyword": "Then "
});
formatter.match({
  "location": "APITest.getUsers()"
});
formatter.result({
  "duration": 2456717888,
  "status": "passed"
});
formatter.match({
  "location": "APITest.validate201()"
});
formatter.result({
  "duration": 404761319,
  "status": "passed"
});
formatter.match({
  "location": "APITest.validateUserDetails()"
});
formatter.result({
  "duration": 778003853,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Validate all users get retrieved",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-all-users-get-retrieved",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user invoke the api for \"\u003cpage\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user will get 200 response for users \"\u003cpage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will see all the users \"\u003cpage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-all-users-get-retrieved;",
  "rows": [
    {
      "cells": [
        "page"
      ],
      "line": 14,
      "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-all-users-get-retrieved;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 15,
      "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-all-users-get-retrieved;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Validate all users get retrieved",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-all-users-get-retrieved;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user invoke the api for \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user will get 200 response for users \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user will see all the users \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    }
  ],
  "location": "APITest.getSingleUsers(String)"
});
formatter.result({
  "duration": 154950355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "APITest.validate200ForUsers(String)"
});
formatter.result({
  "duration": 98729886,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "APITest.validateUserDetails(String)"
});
formatter.result({
  "duration": 2448261018,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Validate user can be updated",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-updated",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user invoke the api for update \"\u003cuser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the user will get update 200 response \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user will see the updated \"\u003cuser\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-updated;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 22,
      "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-updated;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 23,
      "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-updated;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Validate user can be updated",
  "description": "",
  "id": "test-the-apis-and-check-the-data-is-correctly-displayed;validate-user-can-be-updated;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user invoke the api for update \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the user will get update 200 response \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user will see the updated \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    }
  ],
  "location": "APITest.updateUser(String)"
});
formatter.result({
  "duration": 128429374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 39
    }
  ],
  "location": "APITest.validate200ForUpdateUsers(String)"
});
formatter.result({
  "duration": 133243758,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 27
    }
  ],
  "location": "APITest.validateUpdatedUserDetails(String)"
});
formatter.result({
  "duration": 271572827,
  "status": "passed"
});
});