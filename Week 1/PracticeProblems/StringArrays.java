public class StringArrays {
    // TODO: Create a method that takes a string array of names
    // and returns the longest name
    public static String findLongestName(String[] names) {
        String longName = "";
        for(String name : names){
            if(name.length()>longName.length()) longName = name;
        }
        return longName;
    }
    
    // TODO: Create a method that counts how many names
    // start with a given letter (case-insensitive)
    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        for(String name : names){
            if(name.indexOf(letter) == 0) count++;
        }        
        return count;
    }
    
    // TODO: Create a method that formats all names to "Last, First" format
    // Assume names are given as "First Last"
    public static String[] formatNames(String[] names) {
        String[] newName = new String[names.length]; int i = 0;
        for(String name : names){
            String[] str = name.split(" ");
            newName[i] = str[1] + " " + str[0];
            i++;
        }        
        return newName;
    }
    
    public static void main(String[] args) {
        String[] students = {"John Smith", "Alice Johnson", "Bob Brown",
                             "Carol Davis", "David Wilson"};
        // Test all your methods and display results
        System.out.println("Longest name: " + findLongestName(students));
        char letter = 'A';
        System.out.println("Number of names starting with '" + letter + "': " + countNamesStartingWith(students, letter));
        String[] formattedNames = formatNames(students);
        System.out.println("Formatted names:");
        for (String name : formattedNames) {
            System.out.println(name);
        }
    }
}
