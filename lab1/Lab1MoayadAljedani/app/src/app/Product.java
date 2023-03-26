package app;

public abstract class Product {
  private int id;
  private double price;
  String name;
  int quantity;
  private static int TotalQuantity = 0;
  
  public Product(int id, double price, String name){
    this.id = id;
    this.price = price;
    this.name = name;
    this.quantity=1;
    TotalQuantity++;
  }
  public void applySaleDiscount(double percentage){
    this.price = this.price - ((percentage/100) * this.price);
  }

  public abstract void addToShoppingCart();

  public int getTotalQuantity(){
    return Product.TotalQuantity;
  }
  
  public void getSellableStatus(){
    System.out.println("This product is sellable");
  }

  public String toString(){
    return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
      "\tPrice: SR" + this.price;
  }
  
  
}