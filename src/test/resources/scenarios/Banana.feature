Feature: Banana

  Scenario Outline:
    Given One banana costs <bananaPrice>
    When  I want to buy <numberOfBananas>
    Then  The final price is <bananaTotalPrice>

    Examples:
      | bananaPrice | numberOfBananas | bananaTotalPrice |
      | 10          | 5               | 50               |
      | 15          | 10              | 150              |
      | 20          | 25              | 500              |