package model;

import java.util.NoSuchElementException;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void addWord(String word, String meaning){
        words.put(word, meaning);
    }

    public String search(String word) {
        if(words.containsKey(word)){
            return words.get(word);
        }
        throw new NoSuchElementException("Word not found");
    }

}
