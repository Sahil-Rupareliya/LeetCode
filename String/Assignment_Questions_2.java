package String;

public class Assignment_Questions_2 {
    public static void main(String[] args) {
        String s = "asasasa";
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(false);
            }
            left++;
            right--;
        }
        System.out.println(true);
    }
}
