public class TypingChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int matches = 0;
        int length = original.length();
        int firstMismatchIndex = -1;
        char originalChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else {
                if (firstMismatchIndex == -1) {
                    firstMismatchIndex = i;
                    originalChar = original.charAt(i);
                    typedChar = typed.charAt(i);
                }
            }
        }

        double accuracy = ((double) matches / length) * 100.0;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matches, length, accuracy);

        if (firstMismatchIndex != -1) {
            System.out.printf(" | First Mismatch at position %d ('%c' vs '%c')\n", firstMismatchIndex, originalChar, typedChar);
        } else {
            System.out.println(" | No Mismatches");
        }
    }
}
