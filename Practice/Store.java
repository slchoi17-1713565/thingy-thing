public class Store {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + (price * 0.08);
    return totalPrice;
  }

  // toString() method
  public String toString() {
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 3.75);
    Store cookieShop = new Store("cookies", 2.50);
	Store guitarShop = new Store("guitars", 249.99);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadeStand);
	System.out.println(guitarShop);
    System.out.println(cookieShop);
  }
}
