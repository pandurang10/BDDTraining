  Feature: Traning Example For Google Search
   
  @TestOne
  Scenario: 1.  Google Search
    Given Navigate To Google Search Page
     When Enter Search String
      | searchtxt | 
      | Sachin Tendulkar | 
      And Click on Search Button
     Then Validate Search String