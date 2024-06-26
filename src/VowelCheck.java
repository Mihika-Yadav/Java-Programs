// Check the vowel in the String

public class VowelCheck {

    public static boolean checkVowel(String input)
    {
       return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        String name="Mihika";
        System.out.println("Vowel : " +checkVowel(name));
    }
}
