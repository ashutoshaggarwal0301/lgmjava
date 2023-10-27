final class FinalClass {
    // Class content
}

// Attempt to extend a final class (this will result in a compilation error)
// class ChildClass extends FinalClass {}

class inh {
    final void display() {
        System.out.println("This is a final method in the parent class.");
    }
}

class Child extends inh {
    // Attempt to override a final method (this will result in a compilation error)
    // void display() {
    //     System.out.println("This is an attempt to override the final method.");
    // }
}

public class inh {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        inh parent = new inh();
        Child child = new Child();
    }
}
