package String;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class LeetCode2452 {
    public static void main(String[] args) {
        String[] queries = {"word","note","ants","wood"};
        String[] dictionary = {"wood","joke","moat"};
        System.out.println(twoEditWords(queries,dictionary));


    }

    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ansList = new ArrayList<>();
        for(int i=0; i< queries.length; i++){
            if(matchPossible(queries[i],dictionary)){
                ansList.add(queries[i]);
            }
        }
        return ansList;
    }

    private static boolean matchPossible(String query, String[] dictionary) {
        for(int i=0; i<dictionary.length; i++){
            int count = 0;
            for(int j=0; j<query.length(); j++){
                if(query.charAt(j) != dictionary[i].charAt(j)){
                    count++;
                }
                if(count > 2){
                    break;
                }
            }
            if(count <3){
                return true;
            }
        }
        return false;
    }
}
