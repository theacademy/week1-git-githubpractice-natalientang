import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //first example
        if (5 < 10)
            System.out.println("If example");

        // second example
        if (10 < 20)
            System.out.println("If else: executed if condition is true");
        else
            System.out.println("If else: executed if condition is false");
        // switch
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter some value for switch case structure: ");
        int input = Integer.parseInt(myScanner.nextLine());

        if (input == 1)
            System.out.println("Nested if else 1: executed if condition is true");
        else if (input == 2)
            System.out.println("Nested if else 2: executed if condition is true");
        else if (input == 3)
            System.out.println("Nested if else 3: executed if condition is true");
        else
            System.out.println("Please enter integer number within 1-3");

    }
}

//        switch (input)
//        {
//            case 1:
//                System.out.println("Switch case1: executed if condition is true");
//                break;
//            case 2:
//                System.out.println("Switch case2: executed if condition is true");
//                break;
//            case 3:
//                System.out.println("Switch case3: executed if condition is true");
//                break;
//            default:
//                System.out.println("Please enter integer number within 1-3");
//
//        }
//    }
//}
