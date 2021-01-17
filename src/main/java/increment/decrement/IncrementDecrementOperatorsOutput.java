/**
 *
 * @author Ummu Hanisah
 * @since 17-Jan-2021
 * @source
 * https://java.meritcampus.com/core-java-questions/Increment-Decrement-Operators-Output
 */
package increment.decrement;

/**
 *
 * @author Ummu Hanisah
 */
public class IncrementDecrementOperatorsOutput {

    public static void main(String[] args) {
        IncrementDecrementOperatorsOutput incredecre = new IncrementDecrementOperatorsOutput();
        incredecre.incrementDecrementQ6Part3();
    }

    public void incrementDecrementQ2() {
        int i = 4;
        int j = 21;

        int k = ++i * 7 + 2 - j--;

        System.out.println("k = " + k);
        /*Output
        ########
        k = 16
         */
    }

    public void incrementDecrementQ3() {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;

        c++;

        System.out.println("a = " + a);
        System.out.print("b = " + b);
        System.out.println("c = " + c);
        System.out.print("d = " + d);

        /*Output
        ########
        a = 2
        b = 3c = 4
        d = 1
         */
 /*Explanation
        #############
        Execution of program starts from main. Four integer variables a, b, c, d are declared among which a, b are initialized to 1, 2 respectively. Variable c is assigned to ++b which is ++2 = 3. Now value of both c, b becomes 3 (since pre increment). Variable d is assigned to a++ which is 1++ = 2. Now value of d becomes 1 and a becomes 2. c++ performs increment but value is reflected for next usage of c(since post increment). The four display statements print the values as follows:
        a = 2
        b = 3 c = 4 (next usage after increment of c is here in display statement)
        d = 1

        Observe that for printing a and c values println is used, where as for b and d only print is used.
        
         */
    }

    public void incrementDecrementQ4() {
        int input = 7;
        int output = ++input + ++input + ++input; // 8 + 9 + 10
        System.out.println(output);

        /*Output
        ########
        27
         */
    }

    public void incrementDecrementQ5() {
        int i, j, k, l = 0;
        k = l++; // 0
        j = ++k; // 1
        i = j++; // 1
        System.out.println(i);

        /*Output
        ########
        1
         */
    }

    public void incrementDecrementQ6Part1() {
        int number_of_days = 5;
        number_of_days++;
        System.out.println(number_of_days); // 6

        System.out.println(number_of_days--); // 6
        System.out.println(number_of_days); // 5

        /*Output
        ########
        6
        6
        5
         */
    }

    public void incrementDecrementQ6Part2() {
        int dailywage = 4;
        int number_of_days = 5;
        System.out.println(--dailywage * dailywage--);
//        System.out.println(dailywage--);
//        int salary = number_of_days++ * --dailywage * dailywage-- * number_of_days--;
//        System.out.println(dailywage);
//        salary =- dailywage;

//        System.out.println(number_of_days++); // 5
        // 3
//        System.out.println(dailywage++); // 3
//        System.out.println(number_of_days--);
        /*Output
        ########
        4 5 -4
         */
    }

    public void incrementDecrementQ6Part3() {
        int dailywage = 4;
        int number_of_days = 5;
//        int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
        System.out.println(--dailywage);
        System.out.println(dailywage++);
        System.out.println(dailywage);
        int salary =- dailywage;
        System.out.println(salary);

//        salary =- dailywage;
//        System.out.println(salary);
//        System.out.println(dailywage + " " + number_of_days + " " + salary);
    }

    public void incrementDecrementQ6Final() {
        int dailywage = 4;
        int number_of_days = 5;
        int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
        salary = -dailywage;
        System.out.println(dailywage + " " + number_of_days + " " + salary);
        
        /*Output
        ########
        4 5 -4
         */
    }

    public void incrementDecrementQ8() {
//        int i = 34.0;
//        int j = 7;
//
//        int k = i % j;
//
//        System.out.println("k = " + k );
    }
}
