package String;

public class Assignment_Questions_7 {
    public static void main(String[] args) {
        String s = "sahilsahilsahil";
        int[] arr = new int[128];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)]++;
        }

        for(int i=0; i<128; i++){
            if(arr[i] != 0){
                System.out.println((char)i + " " + arr[i] + "  times");
            }
        }
    }
}
