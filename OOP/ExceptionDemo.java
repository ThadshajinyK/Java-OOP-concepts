package OOP; /**
 * Exception handling
 */
import OOP.InsufficientFundException;

import java.io.*;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10,b=0;
        int c=0;
        int[] arr= new int[5];
        arr=null;
        try{
            c=a/b; // throw exception object--> throw Arithmetic exception
            System.out.println(arr[1]); // throw nullpoi.. exception
        }
        catch(NullPointerException e){
            System.err.println("NullPointerException has occured"); // err- red la display aaha use panra
        }
        catch (ArithmeticException e){
          System.out.println("ArithmeticException has occured..");
            //throw new RuntimeException(e);
        }
        catch(Exception e){
            System.out.println("error occured!!!");
        }
        finally {
            System.out.println("This gets printed no matter what");
        }

        File file1 = new File("abc.txt");
        try {
            FileInputStream fs = new FileInputStream(file1);// to process the file
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e); // if we use throw , then program will terminate on this point and further won't run
            System.out.println("hai");
        }

        System.out.println(c);
        System.out.println("End of the program");

      //  Scanner scan = new Scanner(System.in);
      //  int i = scan.nextInt();

      //  scan.close();// appropraite way to close the scanner resource

       // instead of closing scan we can use try catch in other way
        int i=0;
        try(Scanner scan = new Scanner(System.in)) // try with any resourse like buffereader
        {
            i = scan.nextInt();
        }
        System.out.println(i);

        double bal = 500, withdraw =700;
        try{
            if(bal<withdraw)
                throw new InsufficientFundException(withdraw-bal);
        }
        catch(InsufficientFundException e){
                System.out.println("Not enough money");
            }
        }
        }


