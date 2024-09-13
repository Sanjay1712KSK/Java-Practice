public class CheckVowel {
    public static void main(String[] args) {
        String input = "Hello, world!";
        boolean hasVowel = false;

        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                hasVowel = true;
                break;
            }
        }

        if (hasVowel) {
            System.out.println("The string contains a vowel.");
        } else {
            System.out.println("The string does not contain a vowel.");
        }
    }
}
