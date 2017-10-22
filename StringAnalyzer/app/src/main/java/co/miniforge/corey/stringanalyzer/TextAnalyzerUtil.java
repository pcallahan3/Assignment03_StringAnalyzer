package co.miniforge.corey.stringanalyzer;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by corey on 10/14/17.
 */








public class TextAnalyzerUtil extends AppCompatActivity {

    String text;
    TextView getInputText;


    /*
        TextAnalyzerUtil to hold method behhaviors to operate on the data
     */
    public TextAnalyzerUtil(String text){
        this.text = text;
    }

    public int getTextCharacterCount() {

        return text.length();
    }

    public int getWordCount() {

        return text.split(" ").length;
    }


    public int getUniqueCharacters() {
        HashSet<Character> set = new HashSet<>();
        char[] chars = text.toCharArray();

        for (char c : chars) {
            set.add(c);
        }

        return set.size();
    }

    public int getUniqueWords() {
        HashSet<String> set = new HashSet<>();
        String[] words = text.split(" ");

        Collections.addAll(set, words);

        return set.size();
    }

    public String getLongestWord() {
        String longest = "";
        String[] split = text.split(" ");

        for (String s : split) {
            if (s.length() > longest.length()) {
                longest = s;
            }

        }
        return longest;
    }

    public int getSpecialCharacterCount() {

        return (text.replaceAll("([A-Za-z ])", "")).length();
    }
}








