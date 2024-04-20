import java.util.ArrayList;
import java.util.List;

// Product interface
interface IProduct {
    void Operation();
}

// Concrete Product A
class ConcreteProductA implements IProduct {
    @Override
    public void Operation() {
        System.out.println("ConcreteProductA operation.");
    }
}

// Concrete Product B
class ConcreteProductB implements IProduct {
    @Override
    public void Operation() {
        System.out.println("ConcreteProductB operation.");
    }
}

// Creator abstract class
abstract class Creator {
    abstract IProduct FactoryMethod();

    public void AnOperation() {
        IProduct product = FactoryMethod();
        product.Operation();
    }
}

// Concrete Creator A
class ConcreteCreatorA extends Creator {
    @Override
    IProduct FactoryMethod() {
        return new ConcreteProductA();
    }
}

// Concrete Creator B
class ConcreteCreatorB extends Creator {
    @Override
    IProduct FactoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        List<Creator> creators = new ArrayList<>();
        creators.add(new ConcreteCreatorA());
        creators.add(new ConcreteCreatorB());

        for (Creator creator : creators) {
            creator.AnOperation();
        }
    }
}
