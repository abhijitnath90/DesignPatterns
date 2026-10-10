package behavioural.visitor;

import behavioural.visitor.concreteelements.Book;
import behavioural.visitor.concreteelements.Electronic;
import behavioural.visitor.concretevisitors.DiscountCalculator;
import behavioural.visitor.objectstructure.ShoppingCart;
import behavioural.visitor.visitor.ShoppingCartVisitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Book("Design Patterns", 60));
        cart.addProduct(new Electronic("Laptop", 800));
        cart.addProduct(new Book("Clean Code", 40));

        ShoppingCartVisitor discountCalculator = new DiscountCalculator();
        double totalPrice = cart.calculateTotal(discountCalculator);

        System.out.println("Total Cart Price after Discount: " + totalPrice);

    }
}
