package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2125 {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }

    public static int numberOfBeams(String[] bank) {
        List<Integer> arrList = new ArrayList<>();
        for(String i: bank){
            int one = countOne(i);
            if(one != 0){
                arrList.add(one);
            }
        }
        int ans =0;
        for(int i=0; i<arrList.size()-1; i++){
            ans += arrList.get(i)* arrList.get(i+1);
        }
        return ans;
    }

    public static int countOne(String s) {
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
