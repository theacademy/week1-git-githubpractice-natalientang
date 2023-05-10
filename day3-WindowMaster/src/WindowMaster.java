import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        float height;
        float width;

        float areaOfWindow;
        float perimeterOfWindow;
        float cost;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the window height: ");
        height = myScanner.nextFloat();
        System.out.println("Please enter the window width: ");
        width = myScanner.nextFloat();
        System.out.println("Please input the cost for sq: ");
        cost = myScanner.nextFloat();

        areaOfWindow = height * width;
        perimeterOfWindow = (height + width) * 2;

        float totalCost = areaOfWindow * cost;

        System.out.println("Window height= " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = "+ areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + totalCost);
    }
}
