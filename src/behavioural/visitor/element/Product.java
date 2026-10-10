package behavioural.visitor.element;

import behavioural.visitor.visitor.ShoppingCartVisitor;

public interface Product {

    double accept(ShoppingCartVisitor visitor);
}
