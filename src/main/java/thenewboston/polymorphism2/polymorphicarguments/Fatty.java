package thenewboston.polymorphism2.polymorphicarguments;

/**
 *
 * @author uha
 * @date 09-09-2020
 */
public class Fatty {
    public void digest(Food x){ // this digest method has privileged accepting Food object
        // and any subclass, such as Tuna and Potpie
        x.eat();
    }
}
