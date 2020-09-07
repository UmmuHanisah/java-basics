package javainterface;

/**
 *
 * @author uha
 * 
 * @question Is the below program written correctly? If yes, what will be the output?
 * @answer Yes, program is written correctly. Output will be, 4
 */
class Apricot implements Banana {

    public int methodB(int i) {
        return i = +i * i;
    }
}

interface Banana {

    int methodB(int i);
}

public class Question10 {

    public static void main(String[] args) {
        Banana B = new Apricot();
        System.out.println(B.methodB(2));
    }

}
