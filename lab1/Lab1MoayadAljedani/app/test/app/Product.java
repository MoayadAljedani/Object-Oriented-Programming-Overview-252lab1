/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Desktop
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public class Product {
  private int id;
  private double price;
  private String name;
  private int quantity;
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

  public void addToShoppingCart(){
    System.out.println(this.name + " has been added to the shopping cart.");
    this.quantity++;
  }

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
