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
    default void message(){
    }
}

class AndroidPhone implements Phone {

    @Override
    public void call() {
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
