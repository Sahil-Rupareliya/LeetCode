package String;

public class Assignment_Questions_5 {
    public static void main(String[] args) {
        String s = "ddddddds";
        String temp = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'd'){
                temp += 'h';
            }else{
                temp += s.charAt(i);
            }
        }
        s = temp;
        System.out.println(s);
    }
}
