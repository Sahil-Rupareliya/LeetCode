package String;

public class Assignment_Questions_3 {
    public static void main(String[] args) {
        String s = "My name is Sahil";
        splitMethod(s);
        withoutSplit(s);
    }

    private static void withoutSplit(String s) {
        int count =  0;
        s.trim();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println((count+1));
    }

    private static void splitMethod(String s) {
        String[] arr = s.split(" ");
        System.out.println(arr.length);
    }
}
