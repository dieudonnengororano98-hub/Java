package controller;

import model.Dictionary;
import java.util.NoSuchElementException;


public class DictionaryController {

    private Dictionary dictionary = new Dictionary();

    public DictionaryController() {
        dictionary.addWord("Dieudonne", "god gives");
        dictionary.addWord("yellow", "collow");


    }
    public String search(String word){
        if(word == null || word.isBlank()){
            return "please enter a word";
        }
        try{
            return dictionary.search(word);
        } catch(NoSuchElementException e){
            return "Word not found";
        }

    }


}
