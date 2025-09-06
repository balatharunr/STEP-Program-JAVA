import java.util.Scanner;
public class StringMethods{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String fav_lang = scanner.next();
        scanner.nextLine();
        String sentence = scanner.nextLine();
        // TODO: Process the input:
        // 1. Extract first and last name separately
        String[] names = name.split(" ");
        String first_name = names[0];
        String last_name = names[0];
        // 2. Count total characters in the sentence (excluding spaces)
        int count = 0;
        for(String str : sentence.trim().split(" ")){
            count += str.length();
        }
        // 3. Convert programming language to uppercase
        fav_lang = fav_lang.toUpperCase();
        // 4. Display a formatted summary
        System.out.printf("First Name: %s, Last Name: %s, Total Characters (excluding spaces): %d, Favorite Language: %s%n", first_name, last_name, count, fav_lang.toUpperCase());
        scanner.close();
    }
}
