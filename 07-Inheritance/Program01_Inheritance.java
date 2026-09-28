class A {

    int number = 10;

    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void show() {
        System.out.println("Show method of A");
    }
}

class B extends A {

    int number = 20;

    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void show() {
        System.out.println("Show method of B");
    }
}

class C extends B {

    int number = 30;

    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void show() {
        System.out.println("Show method of C");
    }
}

public class Program01_Inheritance {

    public static void main(String[] args) {

        A objectA = new A();
        B objectB = new B();
        C objectC = new C();

        System.out.println("Methods of A:");
        objectA.methodA1();
        objectA.methodA2();
        objectA.show();

        System.out.println("\nMethods of B:");
        objectB.methodA1();
        objectB.methodA2();
        objectB.methodB1();
        objectB.methodB2();
        objectB.show();

        System.out.println("\nMethods of C:");
        objectC.methodA1();
        objectC.methodA2();
        objectC.methodB1();
        objectC.methodB2();
        objectC.methodC1();
        objectC.methodC2();
        objectC.show();

        System.out.println("\nSuperclass reference to B object:");

        A referenceB = new B();
        referenceB.show();

        System.out.println("\nSuperclass reference to C object:");

        A referenceC = new C();
        referenceC.show();

        System.out.println("\nRuntime polymorphism with data members:");

        A referenceA = new A();
        A referenceBData = new B();
        A referenceCData = new C();

        System.out.println("A reference to A object: " + referenceA.number);
        System.out.println("A reference to B object: " + referenceBData.number);
        System.out.println("A reference to C object: " + referenceCData.number);
    }
}