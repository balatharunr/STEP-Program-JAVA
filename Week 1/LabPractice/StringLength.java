import java.util.Scanner;

public class StringLength {
    public static int calculateLength(String str) {
        int count = 0, i = 0;
        try {
            while (true) {
                str.charAt(i);
                count++;
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int customLength = calculateLength(str);
        int builtInLength = str.length();
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
        sc.close();
    }
}