package javainterface;

/**
 * @author uha
 * 
 * @title 35 Java Practice Coding Questions On Interfaces
 * 
 * @question What will be the output of the following program?
 */
interface A {

    void myMethod();
}

class B {

    public void myMethod() {
        System.out.println("My Method B");
    }
}

class C extends B implements A {
}

public class Question3 {

    public static void main(String[] args) {
        A a = new C();
        a.myMethod();
    }
}

/* Output:
My Method B
*/




