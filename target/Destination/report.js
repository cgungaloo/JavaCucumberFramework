$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "home",
  "description": "As a user\r\nI want to be able to search for items through the home page and access sign\r\nSo that I can find things and access my email",
  "id": "home",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17700003550,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "home",
  "description": "",
  "id": "home;home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the search term \"Amazon\" into the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the search results for \"Amazon\" in the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can see the following tabs:",
  "rows": [
    {
      "cells": [
        "All"
      ],
      "line": 10
    },
    {
      "cells": [
        "Shopping"
      ],
      "line": 11
    },
    {
      "cells": [
        "News"
      ],
      "line": 12
    },
    {
      "cells": [
        "Images"
      ],
      "line": 13
    },
    {
      "cells": [
        "Books"
      ],
      "line": 14
    },
    {
      "cells": [
        "More"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 1162868033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 25
    }
  ],
  "location": "MyStepdefs.iEnterTheSearchTermIntoTheSearchBar(String)"
});
formatter.result({
  "duration": 662462404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 34
    }
  ],
  "location": "SearchResultsSteps.iCanSeeTheSearchResultsForInTheSearchResultsPage(String)"
});
formatter.result({
  "duration": 149436716,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsSteps.iCanSeeTheFollowingTabs(String\u003e)"
});
formatter.result({
  "duration": 2054840162,
  "status": "passed"
});
formatter.after({
  "duration": 31646,
  "status": "passed"
});
formatter.before({
  "duration": 21315152922,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Go to Sign In",
  "description": "",
  "id": "home;go-to-sign-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can see the Sign In Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 136867976,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignIn()"
});
formatter.result({
  "duration": 6800986682,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.iCanSeeTheSignInPage()"
});
formatter.result({
  "duration": 51307316,
  "status": "passed"
});
formatter.after({
  "duration": 50891,
  "status": "passed"
});
formatter.uri("terms.feature");
formatter.feature({
  "line": 1,
  "name": "Terms page",
  "description": "",
  "id": "terms-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17503493288,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Go to terms",
  "description": "",
  "id": "terms-page;go-to-terms",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on terms",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should see the terms page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 154903840,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTerms()"
});
formatter.result({
  "duration": 277782411,
  "status": "passed"
});
formatter.match({
  "location": "TermsStepDefs.iShouldSeeTheTermsPage()"
});
formatter.result({
  "duration": 949209718,
  "status": "passed"
});
formatter.after({
  "duration": 53457,
  "status": "passed"
});
});