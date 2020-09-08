package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 *
 * @question Is the following program written correctly? If yes, what will be
 * the output?
 * @answer Yes, program is written is correctly. But, it will throw
 * StackOverflowError at run time. Because, methodOne() and methodTwo() are
 * cyclicly called.
 */

/*
interface ABCD {

    void methodOne();
}

interface PQRS extends ABCD {

    void methodTwo();
}

abstract class XYZ implements PQRS {

    @Override
    public void methodOne() { // This methodOne() is not abstract method, hence any class that extend it doesn't need to implement its method.
        System.out.println("XYZ.methodOne()");
        methodTwo();
    }

}

class MNO extends XYZ {

    public void methodTwo() {
        System.out.println("MNO.methodTwo()");
        methodOne();
    }
}

*/

public class Question16 {

    public static void main(String[] args) {
//        PQRS abcd = new MNO();

//        abcd.methodOne();
//        abcd.methodTwo();
    }
}
