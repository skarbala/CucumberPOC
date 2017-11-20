Feature: Banana

  Scenario Outline:
    Given One banana costs <bananaPrice> EUR
    When  I want to buy <numberOfBananas> bananas
    Then  The final price is <bananaTotalPrice> EUR

    Examples:
      | bananaPrice | numberOfBananas | bananaTotalPrice |
      | 10          | 5               | 50               |
      | 15          | 10              | 150              |
      | 20          | 25              | 500              |