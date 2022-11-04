import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class arraymariosec {
    public static void main(String[] args) {
        int length;
        int last;
        int rotatingtime;

        ArrayList<Integer> myArray = new ArrayList();

        //add values to myArray
        System.out.print("How many elements do you want add: ");
        Scanner EleSize = new Scanner(System.in);
        length = EleSize.nextInt();

        for (int count = 0; count < length; count++) {
            System.out.print("Enter the element: ");
            myArray.add(EleSize.nextInt());
        }

        //this is why rotation did not work
//        EleSize.close();
        System.out.println("The array is:");

/*
        for (int value : myArray) {
            System.out.println(value);
        }
*/
        //print myArray
        System.out.println(myArray);

        // rotation
        System.out.println("How many times do you want to rotate? ");

        //you can use the previous scanner
//        Scanner scan = new Scanner(System.in);
        rotatingtime = EleSize.nextInt();
        EleSize.close();
//        System.out.println(rotatingtime);

//        int rotatingtime = 2 ;


        for( int a=0; a < rotatingtime; a++) {

            last = myArray.get(myArray.size() - 1);
//            System.out.println(last);


            myArray.add(0,last);
            myArray.remove(myArray.size() - 1);
//            System.out.println(myArray);
        }
        System.out.println(myArray);
    }
}
