public class StringManipulation{
    public static void main(String[] args) {
        // TODO: Create the same string "Java Programming" using 3 different methods:
        // 1. String literal
        String str1 = "Java Programming";
        // 2. new String() constructor
        String str2 = new String("Java Programming");
        // 3. Character array
        // TODO: Compare the strings using == and .equals()
        // Print the results and explain the difference
        System.out.println(str1 + " == "+ str2 + ": " + (str1==str2));
        System.out.println(str1 + " equals "+ str2 + ": " + (str1.equals(str2)));
        // TODO: Create a string with escape sequences that displays:
        // Programming Quote:
        // "Code is poetry" - Unknown
        System.out.println("\"Code is poetry\"");
        System.out.println("Path: C:\\Java\\Projects");
        // Path: C:\Java\Projects
    }
}
