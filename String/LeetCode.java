package String;

public class LeetCode {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";

        System.out.println(numOfStrings(patterns,word));

    }

    public static int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for(int i=0; i< patterns.length; i++){
                if(word.contains(patterns[i])){
                    count++;
                }
            }
            return count;
    }


}
