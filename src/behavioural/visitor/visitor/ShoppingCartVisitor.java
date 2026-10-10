package behavioural.visitor.visitor;

import behavioural.visitor.concreteelements.Book;
import behavioural.visitor.concreteelements.Electronic;

public interface ShoppingCartVisitor {

    double visit(Book book);
    double visit(Electronic electronic);

}
