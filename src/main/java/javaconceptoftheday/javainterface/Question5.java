package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 * 
 * @question Why the below code is showing compile time error?
 * @answer Interface methods must be implemented as public. 
 */
public class Question5 {
    
}

interface X {

    void methodX();
}

class Y implements X {

    @Override
    public void methodX() { // original without public
        // Interface methods must be implemented as public. 
        //Because, interface methods are public by default and you should not reduce the visibility of any methods while overriding.
    }
}
