package String;

public class LeetCode2108 {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String s = "";
        for (int i = 0; i < words.length; i++) {
            int left = 0;
            int right = words[i].length()-1;
            while(left <= right){
                if(words[i].charAt(left) == words[i].charAt(right)){
                    if((left == right) || (left+1 == right)){
                        s = words[i];
                        System.out.println(s);
                        return;
                    }
                    left++;
                    right--;
                }else{
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
