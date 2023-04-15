Feature: Sample API Test

  Background: 
    * url 'https://reqres.in/api'
    * header Accept = 'application/json'

  #Simple Get Request
  Scenario: Test simple GET API
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  #Get with Background
  Scenario: Test GET2
    Given path '/users?page=2'
    When method GET
    Then status 200

  #Get with Path and Param
  Scenario: Test GET3
    Given path '/users'
    And param page = 2
    When method GET
    Then status 200
    
#Get with Assertions
  Scenario: Test GET4
    Given path '/users'
    And param page = 2
    When method GET
    Then status 200
    And match response.data[0].first_name != null
    And assert response.data.length == 6
    And match $.data[1].id == 8
    And match $.data[3].last_name == 'Fields'


  