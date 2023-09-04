package String;

public class Assignment_Questions_4 {
    public static void main(String[] args) {
        String s = "Sahil";
        String t = "Sahil";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");

    }
}
