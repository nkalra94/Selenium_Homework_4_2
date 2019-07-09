Feature: As a user I want to navigate to the page
  Choose a product
  Buy a product
Scenario: Navigating to the shop, choosing a product, changing delivery address, buying a product
    Given shopper navigates to the page
    When shopper clicks signIn button
    And filling the email
    And filling the password
    And clicking sign in
    And goes to the women closes
    And choosing a closes
    And selecting black color of the product
    And adding the product to the cart
    And proceeding to checkout from the product page
    And proceeding to checkout from the summary page
    And clicks on update to change the delivery address
    And fills the address field
    And fills the city field
    And select a state
    And fills the postcode field
    And save changes
    And proceed to checkout from address page
    And agree to terms of service
    And proceed to checkout from shipping page
    And select to pay by check method
    And confirming the order
    Then the order is complete




