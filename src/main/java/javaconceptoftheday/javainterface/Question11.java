package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 * 
 * @question Can you find out the errors in the following code?
 * @answer Interfaces can’t have initializers.
 */

interface Antelope { // error in the code
//    {
//        System.out.println("Interface Antelope");
//    }
//    
//    static {
//        System.out.println("Interface Antelope");
//    }
}

/* Note
########
Interface can't declare instance and static blocks.
Otherwise will get complie time error.

*/

public class Question11 {
    
}
