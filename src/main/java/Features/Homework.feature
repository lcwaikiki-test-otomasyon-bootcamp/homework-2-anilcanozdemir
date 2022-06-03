@Homework
Feature: Homework
  Homework 2 adi altinda "https://github.com/lcwaikiki-test-otomasyon-bootcamp/homework-2-anilcanozdemir" github dosyalarina yüklenecek.
  Ödev 2 : Yazılan mimaride 1 adet test yazmanız ve tamamlamanız. Olabildiğince uzun bir şey yazın.
  Login ol, ürün seç, sepete ekle, sepeti kontrol et gibi uzun bir case mesela. Sadece 1 case ile sınırlı kalmayın.

  @Check @Components
  Scenario Outline: LC Waikiki Homepage'den checkout'a kadarki bir ürün arama ve sepete ekleyip onaylama Senaryosudur.
    Given Customer is on HomePage
    When Search "<desired-product>"
    Then should see SearchPage
    When Click "<actual-product>" named product
    Then should see productPage
    When Choosing <size> size and "<renk>" colour and add to cart.
    When Click "<card>" named card on navigationBar
    Then should see CartPage
    Then should see the product which is <size> sized and "<renk>" coloured.
    When should proceed to the checkout
    Then should see CheckOutPage

    Examples:
      | desired-product     | actual-product               | size | renk | card    |
      | Erkek Spor Ayakkabı | Bağcıklı Erkek Spor Ayakkabı | 42   | Gri  | Sepetim |