package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 * 
 * @question Is the following code written correctly?
 * @answer No. An interface can extend another interface not the class.
 */

// ################# Invalid #################
class Asparagus
{
    //Class Asparagus
}
 
//interface Broccoli extends Asparagus // correcvt
//{
    //Interface Broccoli extending Class Asparagus // wrong
//}

// ################# Valid #################
interface FattChoy{
    
}

// can extends -> An interface can extend another interface not the class.
interface Capsicum extends FattChoy
{
    //Interface Broccoli extending Class Asparagus
}

public class Question7 {
    
}
