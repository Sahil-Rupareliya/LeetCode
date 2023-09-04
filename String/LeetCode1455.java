package String;

public class LeetCode1455 {
    public static void main(String[] args) {
        String sentence = "this problem is an easy problem", searchWord = "pro";
        String[] arr = sentence.split(" ");
        int ans =  -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() < searchWord.length()){
                continue;
            }else{
                boolean b = true;
                for(int j=0; j<searchWord.length(); j++){
                    if(searchWord.charAt(j) != arr[i].charAt(j)){
                        b = false ;
                        break;
                    }
                }
                if(b){
                    System.out.println(i+1);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
