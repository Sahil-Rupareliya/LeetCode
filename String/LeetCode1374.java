package String;

public class LeetCode1374 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateTheString(n));
    }

    public static String generateTheString(int n) {
        char[] arr = new char[n];
        for (int i=0; i<n; i++){
            arr[i] = 'a';
        }
        arr[0] = (n%2==0) ? 'b' : 'a';
        return String.valueOf(arr);
    }
}
