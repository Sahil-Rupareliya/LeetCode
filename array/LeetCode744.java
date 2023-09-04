package array;

public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target ='j';

        int left = 1, right = letters.length-1;
       while(left <= right){
           int mid = (left + right)/2;
           if(letters[mid-1] <= target && letters[mid] > target){
               System.out.println(letters[mid]);
               return;
           }else if(letters[mid] <= target){
                left = mid+1;
           }else if(letters[mid] > target){
               right = mid-1;
           }
       }
        System.out.println(letters[0]);
    }
}
