      Feature: Home Module
@smoke@home
      Scenario:
            Given User open application
            When User on welcome screen

@android@home
            Scenario: Verify successful login
                  Given User on welcome page
                  Then I login with "joe" and "ml@123"
      @ios @home
Scenario Outline: Verify login
      Then I login  with "<username>" and "<password>"
      Examples:
      |username | password|
      |joe      |ml@123   |
      |ali      |ml@113   |
            @regression @home
Scenario: Verify login failed
      Given I enter my credentials
      |joe|ml@123|145646|

      Then i verify login failed



