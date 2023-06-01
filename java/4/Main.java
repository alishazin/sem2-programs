class Parent {
    void DisplayParent() {
        System.out.println("This is a content of parent class");
    }
};

class A extends Parent {
    void DisplayChild() {
        System.out.println("display in child class A");
    }
};

class B extends Parent {
    void DisplayChild() {
        System.out.println("display in child class B");
    }
};

class Main {

    public static void main(String args[]) {

        System.out.println("Creating instance of A");
        A a = new A();
        a.DisplayParent();
        a.DisplayChild();

        System.out.println();

        System.out.println("Creating instance of B");
        B b = new B();
        b.DisplayParent();
        b.DisplayChild();
    }
};