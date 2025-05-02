public class SubstringCheckWithBuiltIn {
    public static void main(String[] args) {
        String mainString = "hello world";
        String subString = "world";

        // Using contains() to check for substring
        if (mainString.contains(subString)) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found.");
        }
    }
}
