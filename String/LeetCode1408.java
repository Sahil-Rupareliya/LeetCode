package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1408 {
    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};
        List<String> ansList = new ArrayList<>();
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j< words.length; j++){
                if(words[i].contains(words[j])){
                    if(!(ansList.contains(words[j]))) {
                        ansList.add(words[j]);
                    }
                }else if(words[j].contains(words[i])){
                    if(!(ansList.contains(words[i]))) {
                        ansList.add(words[i]);
                    }
                }
            }
        }
        System.out.println(ansList);
    }
}
