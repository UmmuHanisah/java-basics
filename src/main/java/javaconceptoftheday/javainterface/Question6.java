package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 * @question Does below code compile successfully? If not, why?
 * @answer No, because interface fields are static and final by default 
 */
public class Question6 {

}

// A: No, because interface fields are static and final by default 
// and you can’t change their value once they are initialized. 
// In the above code, methodB() is changing value of interface field A.i. 
// It shows compile time error.
interface Ant {
    int i = 100;
}

class Buffalo implements Ant {

    void methodB() {
//        i = 222; Cannot assign value to a final variable i
    }
}
