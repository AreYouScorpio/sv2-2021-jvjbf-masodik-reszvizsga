package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> addWord(String word) {

        if (word.contains(" ")) {
            throw new IllegalArgumentException("It should be one word!");
        } else {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!Character.isLowerCase(chars[i])) {
                    throw new IllegalArgumentException("Word should be lower case!");
                }
            }
            words.add(word);
        }
        return words;
    }

    public boolean isThereAWordTwice() {
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++)
                if (words.get(j).equals(words.get(i))) return true;
        }
        return false;
    }

    public List<String> getWords() {
        return words;
    }
}
