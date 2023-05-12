public class Methods {
    public static void main(String[] args) {
        display();
        int result = display2();
        display3(result);
        int r = display4(result);
    }
    static void display() {
        System.out.println("void display ()");
    }
    static int display2() {
        System.out.println("int display2 ()");

        return(10 + 5);
    }
    static void display3 (int result) {
        System.out.println("int display3 (int result)");
    }
    static int display4 (int result) {
        System.out.println("int display4 (int result)");

        return result;
    }
}
