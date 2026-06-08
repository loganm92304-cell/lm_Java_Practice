import java.util.*;

public class DictionaryDemo {

    public static void main(String[] args) {

        Hashtable<Word, String> dictionary = new Hashtable<>();

        Word w1 = new Word("cat");
        Word w2 = new Word("dog");

        // Add words
        dictionary.put(w1, "A small animal");
        dictionary.put(w2, "A loyal animal");

        // Retrieve word
        System.out.println("Definition of cat: " + dictionary.get(w1));

        // Remove word
        dictionary.remove(w2);

        System.out.println("Dictionary after removal: " + dictionary);
    }
}