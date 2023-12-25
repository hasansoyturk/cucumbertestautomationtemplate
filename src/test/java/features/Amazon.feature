Feature: Amazon.com
  Scenario: Amazon.com.tr adding product in chart
    Given go Homepage
    When Click accept cookies button
    When  Click search label
    When  Write product name
    When Click search button
    When  Click shipped by Amazon button
    When Click Apple
    When  Click to first product
    When Click Add to chart
    When Check the cart
