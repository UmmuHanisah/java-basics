package javainterface;

/**
 *
 * @author uha
 *
 * @question What will be the output of the following program?
 */
interface P {

    String p = "PPPP";

    String methodP();
}

interface Q extends P {

    String q = "QQQQ";

    String methodQ();
}

class R implements P, Q {

    public String methodP() {
        return q + p;
    }

    public String methodQ() {
        return p + q;
    }
}

public class Question8 {

    public static void main(String[] args) {
        R r = new R();

        System.out.println(r.methodP()); // QQQQPPPP

        System.out.println(r.methodQ()); // PPPPQQQQ
    }
}

/* Output
#########
QQQQPPPP
PPPPQQQQ
*/
