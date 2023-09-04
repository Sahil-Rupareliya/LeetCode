package String;

public class LeetCode944 {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int count =0;
        for(int i=0; i<strs[0].length(); i++){
            for(int j=0; j< strs.length-1; j++){
                if(strs[j+1].charAt(i) < strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
