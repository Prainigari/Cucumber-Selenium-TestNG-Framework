Feature: Amazon validation
 @Amazon
  Scenario: Validate second highest price of TV
    Given I click on Hamburger link
    And I click on Electronics link
    And I click on TV link
    And I click on TopBrands checkbox
    And I click on Samsung checkbox
    And I click on SortbyFeatured button
    And I click on HightoLow option
    And I click on SecondHighestPriceTV option
    And I switch to new tab
    And I verify AboutThisItem element exists
