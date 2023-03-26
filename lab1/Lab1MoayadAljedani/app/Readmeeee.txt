Q1: the quantity is being implemented wrong in the constructor it assigns the value 1 every time a product is created to fix that we need to make a static variable that keeps track of the quantity for each product 
Q2: First I had a hard time trying to implement the unit test but I fix the issue I had and now it returns the correct quantity 

Q3: to stop the direct instantiation of the product class we should make it an abstract class so that it can't be instantiated directly and the concrete subclasses of a product must implement addToShoppingCart() because its abstract 

Q4: I created an array of 3 products objects and I used an enhanced for loop to go through the array of products for each product, which we call the addToshopping method

Q5: We should put final to make the method cannot be overwritten 

Q6: it is bad because the product class should only represent the product behavior and the order is not a product behaviour or an attribute 
to fix it we can create a new class named order that has all the information about the order

Q7: it's bad because like that we make it expose for any unauthorized access and that is really bad can sabotage an entire program and to fix that we need to make the weight private and give it a public getter and protected setter so that only can be accessed by the setters and getters and prevent external modification