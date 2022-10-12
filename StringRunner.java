import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.println("String Length: " + str1.length());
        System.out.println("First Half: " + str1.substring(0, str1.length()/2) );
        System.out.println("Second Half: " + str1.substring(str1.length/2) );

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        if (str1.length() < str2.length()) {
            System.out.println(str2 + " is longer");
        } else-if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        }else {
            System.out.println("Both strings have the same length");
        }

        if (str1.equals(str2)) {
            System.out.println("Both strings have the exact same characters");
        } else {
            if (str1.compareto(str2) < 0) {
                System.out.println(str1 + " is first alphabetically");
            } else {
                Systemout.println(str2 + " is first alphabetically");
            }
        }

        int indexValue = str1.indexOf(str2);
        if (indexValue == -1) {
            System.out.println(str2 + " is NOT found in " + str1);
        } else {
            System.out.println(str2 + " is found in " + str1 + " at index " + indexValue);
        }
    }
}
