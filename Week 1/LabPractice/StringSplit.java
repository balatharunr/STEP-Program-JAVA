
import java.util.Scanner;

public class StringSplit {
    public static int StringLength(String str) {
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
    public static String[] SplitString(String str){
        int wordCount = 0;
        for(int i = 0; i < StringLength(str); i++) if(str.charAt(i) == ' ' || i == StringLength(str)-1) wordCount++;
        int[] index = new int[wordCount]; int n = 0;
        for(int i = 0; i < StringLength(str); i++) if(str.charAt(i) == ' ' ) index[n++] = i; else if (i == StringLength(str)-1) index[n++] = i+1;
        int start = 0;
        String[] arr = new String[wordCount];
        for(int i = 0; i < wordCount; i++){
            int end = index[i];
            arr[i] = str.substring(start,end);
            start = end+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] customSplit = SplitString(str);
        String[] builtInSplit = str.split(" ");
        System.out.println("Split using custom method: ");
        for(String word : customSplit) System.out.println(word);
        System.out.println("Split using built-in method: ");
        for(String word : builtInSplit) System.out.println(word);
        sc.close();
    }
}
