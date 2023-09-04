package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2788 {
    public static void main(String[] args) {
        String[] words = {"one.two.three","four.five","six"}; char separator = '.';
        System.out.println(splitWordsBySeparator(Arrays.asList(words),separator));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ansList = new ArrayList<>();
        for(int i=0; i<words.size(); i++){
            String temp = words.get(i);
            StringBuilder sb = new StringBuilder();
            for(char ch: temp.toCharArray()){
                if(ch == separator){
                    if(sb.length() > 0) {
                        ansList.add(sb.toString());
                        sb.setLength(0);
                    }
                }else{
                    sb.append(ch);
                }
            }
            if(sb.length() > 0){
                ansList.add(sb.toString());
            }
        }
        return ansList;
    }
}
