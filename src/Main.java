import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter d1 aand d2");
        String d1 = s.nextLine();
        String d2 = s.nextLine();
        System.out.println(Double.parseDouble(d1) + Double.parseDouble(d2));
    }
}