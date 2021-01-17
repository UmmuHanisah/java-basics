/**
 *
 * @author Ummu Hanisah
 * @source
 * https://java.meritcampus.com/core-java-questions/Increment-Decrement-Operators-Output
 * @since 16-Jan-2021
 */
package increment.decrement;

/**
 *
 * @author Ummu Hanisah
 */
public class IncrementDecrementOperatorsOutputQ1 {

    public static void main(String[] args) {

        IncrementDecrementOperatorsOutputQ1 increment = new IncrementDecrementOperatorsOutputQ1();
        increment.q1Operators1Final();
    }

    private void q1Operators1Part1() {
        int a = 34;
        int b = 21;
        int c = a++; // postfix
        int d = ++b; // prefix

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);

        /*Output
        ########
        a 35
        b 22
        c 34
        d 22
         */
    }

    private void q1Operators1Part2() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b;

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);

        /*Output
        ########
        a 35
        b 22
        c 56
         */
    }

    private void q1Operators1Part3() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b; // 56
        System.out.println("c " + c--); // 56
        System.out.println("c " + c); // 55
        int d = --a + --b + c--; // a 34, b 21, c 56 -> 34 + 21 + 56 = 

        System.out.println("a " + a); //34
        System.out.println("b " + b); //21
        System.out.println("c " + c); //
        System.out.println("d " + d);

        /*Output
        ########
        a 35
        b 22
        c 55
        d 111
         */
    }

    private void q1Operators1Part4() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b; // 56
        int d = --a + --b + c--; // a 34, b 21, c 56 -> 34 + 21 + 56 = 111

        System.out.println("d " + d);

        /*Output
        ########
        d 111
         */
    }

    private void q1Operators1Part5() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b; // 56
        int d = --a + --b + c--; // a 34, b 21, c 56 -> 34 + 21 + 56 = 111
        int e = a + +b + +c + d--; // a 34, b 21, c 55, d 111 -> 34 + 21 + 55 + 111 = 221

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("e " + e);

        /*Output
        ########
        a 35
        b 22
        c 56
        d 111
        e
         */
    }

    private void q1Operators1Part6() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b; // 56
        int d = --a + --b + c--; // a 34, b 21, c 56 -> 34 + 21 + 56 = 111
        int e = a + +b + +c + d--; // a 34, b 21, c 55, d 111 -> 34 + 21 + 55 + 111 = 221

        System.out.println("e " + e);

        /*Output
        ########
        e 221
         */
    }

    private void q1Operators1Part7() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b; // 56
        int d = --a + --b + c--; // a 34, b 21, c 56 -> 34 + 21 + 56 = 111
        int e = a + +b + +c + d--; // a 34, b 21, c 55, d 111 -> 34 + 21 + 55 + 111 = 221

        System.out.println("a " + -a);
        System.out.println("b " + b--);
        System.out.println("c " + -c);
        System.out.println("d " + -d++);

        //int f = -a + b-- + -c - d++; // a -34, b 21, c -55, d 110 -> -34 + 21 + (-55) - 110 = -178

        /*Output
        ########
        f -178
         */
    }

    private void q1Operators1Part8() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +c + d--;
        int f = -a + b-- + -c - d++;
        System.out.println("f " + f);

        /*Output
        ########
        f -178
         */
    }

    private void q1Operators1Final() {
        int a = 34;
        int b = 21;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +c + d--;
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);
        
        /*Output
        ########
        sum = 263
         */
    }
}
