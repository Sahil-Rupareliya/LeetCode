package String;

public class LeetCode917 {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left=0, right = arr.length-1;
        while(left < right){
            if(arr[left] < 65 || arr[left]>90 && arr[left] < 97){
                left++;
            }else if(arr[right] < 65 || arr[right]>90 && arr[right] < 97){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);



    }
}
