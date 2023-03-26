/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Desktop
 */
public class AppTest {
    
    public AppTest() {
    }

    @Test
    public void testSomeMethod() {
        
        Product p1 = new Product(6745, 5.50, "Penne Pasta");
    Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
    Product p3 = new Product(2106, 4.50, "Linguine Pasta");
    System.out.println("Total Quantity: " + p3.getTotalQuantity());
    assertEquals(p3.getTotalQuantity(),3);
    }
    
}
