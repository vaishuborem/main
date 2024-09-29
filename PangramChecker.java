import java.util.HashSet;

public class PangramChecker {

    public static int isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        return letters.size() == 26 ? 1 : -1; // Return 1 if pangram, else -1
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy Dog";
        System.out.println(isPangram(sentence)); // Output: 1
    }
}
