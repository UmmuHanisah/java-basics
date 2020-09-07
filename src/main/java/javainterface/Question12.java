package javainterface;

/**
 *
 * @author uha
 *
 * @question How do you access interface field ‘i’ in the below code?
 * @answer P.Q.i
 */
class Panda {

    interface Quill {

        int i = 111;
    }

}

public class Question12 {

    public static void main(String[] args) {
        
        Panda p = new Panda();
        System.out.println(Panda.Quill.i);
    }
}
