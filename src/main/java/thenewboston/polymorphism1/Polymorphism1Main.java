package thenewboston.polymorphism1;

/**
 *
 * @author uha
 * 
 * @title Java Programming Tutorial - 55 - Introduction to Polymorphism
 * @source https://www.youtube.com/watch?v=0xw06loTm1k
 */
public class Polymorphism1Main {

    public static void main(String[] args) {
        Food bucky[] = new Food[2];
        bucky[0] = new Potpie();
        bucky[1] = new Tuna();

        // Tuna and Potpie are food type
        // Anything that inherit from Food which is super class can be assigned to Bucky
        
        for (int x = 0; x < 2; ++x) {
            bucky[x].eat();
        }
    }
}

/*Output
* ######
* This potpie is great
* This tuna is great
*/
