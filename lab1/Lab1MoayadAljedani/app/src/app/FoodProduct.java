/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.time.LocalDate;

public class FoodProduct extends Product{
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate){
    super(id, price, name);
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }

    @Override
    public final void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    this.quantity++;}
}