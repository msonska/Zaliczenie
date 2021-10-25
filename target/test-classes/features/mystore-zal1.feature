#Zadanie warsztatowe 1 - Selenium WebDriver + Cucumber
#Utwórz użytkownika manualnie na stronie https://mystore-testlab.coderslab.pl.
#
#Możesz wykorzystać tymczasowego maila do utworzenia użytkownika https://10minutemail.com/.
#
#
#Napisz skrypt, który:
#
#będzie logować się na tego stworzonego użytkownika,
#wejdzie klikając w kafelek Addresses po zalogowaniu (adres, na którym powinniśmy się znaleźć to: https://mystore-testlab.coderslab.pl/index.php?controller=addresses ),
#kliknie w + Create new address,
#wypełni formularz New address - dane powinny być pobierane z tabeli Examples w Gherkinie (alias, address, city, zip/postal, code, country, phone),
#sprawdzi czy dane w dodanym adresie są poprawne.
#
#
#
#Dodatkowe kroki dla chętnych:
#
#usunie powyższy adres klikając w "delete",
#sprawdzi czy adres został usunięty.

@mystore
Feature: Mystore address change
  @address
  Scenario Outline: user can edit address data

    Given I am logged in on my store page with login and password
    When I click user name
    And I click add address button
    And I enter text in <address> <zipCode> <city>  fields and choose country
    And I click save button
    Then message "Your account has been created." visible
    Examples:
      | address               | zipCode | city |
      | Lalaajja   | gdfhfd     | Pcim   |
      | Lsndjsh| dgfgf     | Warszawa |