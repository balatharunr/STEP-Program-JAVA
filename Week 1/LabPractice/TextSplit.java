import java.util.Scanner;

public class TextSplit {
    public static int Length(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return length;
    }
    public static String[][] wordSplit(String text) {
        int length = Length(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }
        String[] words = new String[wordCount];
        String[][] arr = new String[wordCount][2];
        int start = 0, wIndex = 0;
        inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                start = i; 
                inWord = true;
            }
            if ((text.charAt(i) == ' ' && inWord) || (i == length - 1 && inWord)) {
                int end = (text.charAt(i) == ' ') ? i : i + 1;
                words[wIndex++] = text.substring(start, end);
                inWord = false;
            }
        }
        for (int i = 0; i < wordCount; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(Length(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] arr = wordSplit(text);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
