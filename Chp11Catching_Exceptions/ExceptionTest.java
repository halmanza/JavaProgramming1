/*Program:  Chapter 11 Catching_Exceptions           */
/*CIS163AA-17045                                            */
/*Anthony Almanza                                           */
/*07/6/2020                                                */
/* Program uses static methods to throw exceptions inside try blocks and catches each 
exception */
/************************************************************/
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            getExceptionB();

        } catch (Exception exception) {
            exception.printStackTrace();
           
        }

        try {
            getExceptionA();

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            getIOException();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try {

            getNullPointerException();

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getIOException() throws IOException {
        throw new IOException();
    }

    public static void getNullPointerException() throws NullPointerException {
        throw new NullPointerException();
    }
}
