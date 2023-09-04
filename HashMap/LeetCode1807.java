package HashMap;

import java.util.*;

public class LeetCode1807 {
    public static void main(String[] args) {
        String s = "hi(name)";
        List<List<String>> knowledge = new ArrayList<>();
        String[] arr ={"a","b"};
        knowledge.add(Arrays.asList(arr));
//        knowledge.add(Arrays.asList(arr2));
        System.out.println(evaluate(s,knowledge));
    }

    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '('){
                sb.append(s.charAt(i));
            }else if(s.charAt(i) == '('){
                int start = i+1;
                while (i < s.length() && s.charAt(i) != ')'){
                    i++;
                }
                sb.append(map.getOrDefault(s.substring(start,i), "?"));
            }
        }
        return sb.toString();
    }
}
