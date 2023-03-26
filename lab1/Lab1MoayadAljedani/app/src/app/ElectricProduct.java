/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ElectricProduct extends Product{

  private String voltage;

  public ElectricProduct(int id, double price, String name, String voltage){
    super(id, price, name);
    this.voltage = voltage;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

    @Override
    public final void addToShoppingCart() {
      System.out.println(this.name + " has been added to the shopping cart.");
    this.quantity++;
    }

}
