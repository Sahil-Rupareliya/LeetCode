package String;

public class Assignment_Questions_1 {
    public static void main(String[] args) {
        String s = "Sahil Ashokbhai Rupareliya";
        reverse(s);

    }
    private static void reverse(String s) {
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        System.out.println("Reverse String of " + s + " " + "is " + s1);
    }
}
