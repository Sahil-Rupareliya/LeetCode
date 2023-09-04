package String;

public class Assignment_Questions_9 {
    public static void main(String[] args) {
        String s =  "ym eman si lihas";
        String temp = "";
        String[] arr = s.split(" ");
        for (String i: arr){
            i = reverse(i);
            temp += i + " ";
        }
        System.out.println(temp.trim());

    }

    private static String reverse(String s) {
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        return s1;
    }
}
