package app;

import java.time.LocalDate;

/**
 *
 * @author Desktop
 */
public class App {

    public static void main(String[] args) {
//       Broken because of the abstract class

//Product p1 = new Product(6745, 5.50, "Penne Pasta") {};
//        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta") {};
//        Product p3 = new Product(2106, 4.50, "Linguine Pasta") {};
//        System.out.println("Total Quantity: " + p3.getTotalQuantity());
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",
                LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        Product[] products = new Product[3];
        FoodProduct p6 = new FoodProduct(1234, 9.99, "water", LocalDate.parse("2022-06-07"));
        //  Q 4
        products[0] = p4;
        products[1] = p5;
        products[2] = p6;
        for (Product p : products) {
            p.addToShoppingCart();
        }

        System.out.println(p4.getTotalQuantity());
    }

}
