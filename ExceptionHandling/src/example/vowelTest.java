package example;

public class vowelTest {

    static class NoVowelException extends Exception {
        NoVowelException(String message) {
            super(message);
        }
    }

    static void checkVowel(String str) throws NoVowelException {
        str = str.toLowerCase();
        if (!str.matches(".*[aeiou].*")) {
            throw new NoVowelException("No vowels found in the string!");
        } else {
            System.out.println("Vowels are present in the string.");
        }
    }

    public static void main(String args[]) {
        String name = "Arpita";  
        try {
            checkVowel(name);
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }
}
