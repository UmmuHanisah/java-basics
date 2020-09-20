/**
 *
 * @author uha
 * @date 20-09-2020
 */
package interfacejava8;

/**
 *
 * @author uha
 */


interface InterfaceA { 
    default void defaultMethod(){ 
        System.out.println("Interface A default method"); 
    } 
}

interface InterfaceB {
    default void defaultMethod(){
        System.out.println("Interface B default method");
    }
}

public class Impl implements InterfaceA, InterfaceB  {
    @Override
    public void defaultMethod(){
        InterfaceA.super.defaultMethod();
    }
}
