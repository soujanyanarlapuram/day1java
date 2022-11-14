
import java.util.Scanner;
public class Two_strings {
    public static void main(String[] args) {
         System.out.println("enter the string1:");
         Scanner sc = new Scanner(System.in);
         String str1 = sc.nextLine();
         System.out.println("str1:" + str1);
         System.out.println("enter the string2:");
         String str2 = sc.nextLine();
         System.out.println("str2:" + str2);
         if (str1.equals(str2)) {
             System.out.println("both strings are equal");
         } else {
             System.out.println("both are not equal");
         }
     }
 }

