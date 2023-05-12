import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //able to use the method without retyping everything
        Display();
    }

        static void Display() {
            Scanner myScanner = new Scanner(System.in);
            for(int i = 0; i < 3; i++) {
                System.out.println("Please enter your name: ");
                String name = myScanner.nextLine();
                System.out.println("Write intro about yourself: ");
                String intro = myScanner.nextLine();
            }
        }


}
