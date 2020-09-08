package thenewboston.polymorphism1;

/**
 *
 * @author uha
 */
public class Polymorphism1Main {

    public static void main(String[] args) {
        Food bucky[] = new Food[2];
        bucky[0] = new Potpie();
        bucky[1] = new Tuna();

        // Tuna and Potpie are food type
        // Anything that inherit from Food which is supe class can be assigned to Bucky
        
        for (int x = 0; x < 2; ++x) {
            bucky[x].eat();
        }
    }

}
