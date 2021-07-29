#Author: Catalina Calle

  @stories
  Feature: Utest Platform
    As a user, want to create an account at Utest Platform

  @scenario1
  Scenario: Fill out register form
    Given as Catalina wants to create an account at Utest
    When  She fills out the register form
    |firstName|lastName|email           |birthMonth|birthDay|birthYear|language|city     |zip |country  |computerOS|computerOSVersion|computerOSLanguage|mobileBrand|mobileModel|mobileOS  |password     |
    |Catalina |Gomez   |cgomez@utest.com|May       |15      |1999     |Spanish |Melbourne|3006|Australia|Xubuntu   |Xubuntu 18.04     |English           |Samsung    |Galaxy A50 |Android 11|Choucair2021*|
    Then  She validates a label on last page
    |lastStepLabel|
    |The last step|
