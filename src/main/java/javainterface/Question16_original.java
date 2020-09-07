package javainterface;

/**
 *
 * @author uha
 * 
 * @question Is the following program written correctly? If yes, what will be the output?
 * 
 * @answer Yes, program is written is correctly. But, it will throw StackOverflowError at run time. 
 * Because, methodOne() and methodTwo() are cyclicly called.
 */

interface ABCC
{
    void methodOne();
}
 
interface PQRS extends ABCC
{   
    void methodTwo();
}
 
abstract class XYZ implements PQR
{
    public void methodOne()
    {
        methodTwo();
    }
}
 
class MNO extends XYZ
{
    public void methodTwo()
    {
        methodOne();
    }
}
 
public class Question16_original
{
    public static void main(String[] args)
    {
        ABC abc = new MNO();
         
        abc.methodOne();
    }
}
