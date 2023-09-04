package String;

public class Assignment_Questions_6 {
    public static void main(String[] args) {
        String s = "sahil";
        char[] arr = s.toCharArray();

        for(int i=0; i<s.length()-1; i++){
            for (int j=0; j<s.length()-i; j++){
                if(arr[i] > arr[i+1]){
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        s = String.valueOf(arr);
        System.out.println(s);

    }
}
