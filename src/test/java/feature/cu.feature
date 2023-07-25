Feature: Login 

 Scenario: Successful Login with Valid Credentials
    Given User Launch chrome browser
    When  user open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page Tite should be "Dashboard/nopcommerce administration"
    When User click on logout link 
    Then Page title should be "your store.Login"
    And close browser  
     
   

 