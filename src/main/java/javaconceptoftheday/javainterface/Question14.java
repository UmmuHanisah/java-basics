package javaconceptoftheday.javainterface;

/**
 *
 * @author uha
 * 
 * @question Does below program compile successfully?
 * @answer Yes, program compiles successfully.
 */
interface ABC {

    public void methodOne();

    public void methodTwo();
}

interface PQR extends ABC {

    @Override
    public void methodOne();

    @Override
    public void methodTwo();
}

public class Question14 {
    public static void main(String[] args) {
        
    }
}
