package thenewboston.polymorphism2.polymorphicarguments;

/**
 *
 * @author uha
 * @date 09-09-2020
 * @title Polymorphic Argument
 */
public class ApplesMain {
    public static void main(String[] args) {
        Fatty bucky = new Fatty(); // we created an object named Bucky, so we can use all the stuff in Fatty class
        Food fo = new Food(); // we create new Food object, because digest method in Fatty class took a Food object as it argument
        Food po = new Potpie(); // we create Potpie object, Potpie object is the subclass of the Food superclass
        // Note
        // ####
        // anytime when digest method can take Food argument, it can also take Potpie and Tuna as well
        
        bucky.digest(fo);
        bucky.digest(po);
    }
}
