package contest;

import java.util.Arrays;

public class LeetCode6926 {

    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }


    public static String sortVowels(String s) {
        int[] arr=  new int[s.length()];
        int pointer = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
            || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                arr[pointer++] = s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        pointer= arr.length-pointer;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
                    || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                sb.append((char)arr[pointer++]);
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
