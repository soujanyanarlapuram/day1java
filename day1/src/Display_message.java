
import java.util.Scanner;
public class Display_message {
    public static void main(String[] args) {
        System.out.println("enter the message below:");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        System.out.println("message:" + msg);
    }
}

