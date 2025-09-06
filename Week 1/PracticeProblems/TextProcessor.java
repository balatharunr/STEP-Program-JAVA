import java.util.Scanner;
public class TextProcessor{
    // TODO: Method to clean and validate input
    public static String cleanInput(String input) {
        // Remove extra spaces, convert to proper case
        // Return cleaned string
        return input.trim();
    }
    
    // TODO: Method to analyze text
    public static void analyzeText(String text) {
        // Count: words, sentences, characters
        int[] freq = new int[256];
        String Long=" "; int wordCount = 0, charCount = 0;
        // Find: longest word, most common character
        for(String word : text.split(" ")) {
            if(word.length()>Long.length()) Long = word;
            wordCount++;
            for(char ch : word.toCharArray()){
                charCount++;
                freq[ch]++;
            }
        }
        // Display statistics
        char max = '\0'; int maxnum = 0;
        for(int i = 0; i < 256; i++){
            if(freq[i] > maxnum){
                maxnum = freq[i]; max = (char)i;
            }
        }
        System.out.print("Maximum char: "+ max);
    }
    
    // TODO: Method to create word array and sort alphabetically
    public static String[] getWordsSorted(String text) {
        // Split text into words, remove punctuation, sort
        String words[] = text.trim().split(" ");
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]", ""); // Remove punctuation
        }
        // Sort the array alphabetically
        java.util.Arrays.sort(words);
        // Return sorted array
        return words;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");
        // Step 1: Ask user for a paragraph of text
        System.out.println("Enter a paragraph of text:");
        String input = scanner.nextLine();
        String cleanedInput = cleanInput(input);
        analyzeText(cleanedInput);
        String[] sortedWords = getWordsSorted(cleanedInput);
        System.out.println("\nWords in alphabetical order:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
        System.out.println("\nEnter a word to search:");
        String searchWord = scanner.nextLine().trim();
        boolean found = java.util.Arrays.asList(sortedWords).contains(searchWord);
        if (found) {
            System.out.println("The word \"" + searchWord + "\" was found.");
        } else {
            System.out.println("The word \"" + searchWord + "\" was not found.");
        }
        scanner.close();
    }
}
