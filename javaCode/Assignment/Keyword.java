import java.util.*;

public class Keyword {
    public static List<String> findKeywords(String message) {
        String[] words = message.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        List<String> keywords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= 3) {
                keywords.add(entry.getKey());
            }
        }
        if (keywords.size() > 0) {
            return keywords;
        } else {
            String biggestWord = "";
            String smallestWord = words[0];
            for (String word : words) {
                if (word.length() > biggestWord.length()) {
                    biggestWord = word;
                }
                if (word.length() < smallestWord.length()) {
                    smallestWord = word;
                }
            }
            List<String> result = new ArrayList<>();
            result.add(biggestWord);
            result.add(smallestWord);
            return result;
        }
    }

    public static void main(String[] args) {
        String message = "It is hard to fail but it is worse never have tried to succeed";
        System.out.println(findKeywords(message));
    }
}
