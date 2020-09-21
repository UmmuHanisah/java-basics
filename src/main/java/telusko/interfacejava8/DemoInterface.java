/**
 *
 * @author uha
 * @date 20-09-2020
 * @title Default Method in Interface
 * @source https://www.youtube.com/watch?v=bYzIXYqmTDo
 */
package telusko.interfacejava8;

interface Phone {
    void call();
    default void message(){ // new feature in Java 8, we can define a method in it (a method with body)
        System.out.println("Send message");
    }
}

class AndroidPhone implements Phone {

    @Override
    public void call() { // call method must be implement coz it's an abstract method
        System.out.println("Calling");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        Phone p = new AndroidPhone();
        p.call();
        p.message();
    }
}

/* Output
   ######
   Calling
   Send message
*/
