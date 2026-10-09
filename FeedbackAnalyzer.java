import java.util.*;

public class FeedbackAnalyzer {
    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) {
            return;
        }
        
        // Define stop words
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is"));
        
        // Normalize: lowercase and remove periods/commas
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty() && !stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        // Sort by count in descending order
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        // Print results
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
