@regression @smoke @us-246
Feature: Shetty Alert Outline

Scenario Outline: Selenium Alert
                Given Open Shetty Homepage
                When Click on "<Button>"
                Then Click on "<Alert>"

        Examples:
                |Button         |Alert          |
                |Alert          |OK             |
             