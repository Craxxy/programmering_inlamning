import java.util.*;
public class CharCounter {
    private final ArrayList<String> words = new ArrayList<String>();

    public void addWords(String word){
        this.words.add(word);
    }

    public int getAmountOfLines(){
        return this.words.size();
    }

    public int getAmountOfChars(){
        int chars = 0;
        for(String w : words){
            for(String ch : w.split("")){
                chars+=1;
            }
        }
        return chars;
    }

    public ArrayList<String> getWordArrayList(){
        return words;
    }
}
