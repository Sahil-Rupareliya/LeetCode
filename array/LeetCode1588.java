package array;

public class LeetCode1588 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int n = arr.length;
        int sum = 0;
        if(n%2 ==0){
            int multiply = n/2;
            int multiTemp = (n/2) -1;
            int start = 0;
            int end = n-1;
            for(int i=0; i<n/2; i++){
                sum = sum + (arr[start++] + arr[end--])*(multiply);
                multiply += multiTemp--;
            }
            System.out.println(sum);
        }else{
            int start = 0;
            int end = n-1;
            int multiply = (n/2)+1;
            int multiTemp = (n/2)+1;
            for(int i=0; i<n/2; i++){
                sum = sum + (arr[start++] + arr[end--])*(multiply);
                if(i%2==0){
                    multiTemp -= 2;
                }
                multiply += multiTemp;
            }
            System.out.println(multiply);
            sum += arr[(n/2)]*multiply;
            System.out.println(sum);
        }

        //
//        int l = arr.length;
//        int sum = 0;
//        for(int i = 0; i < l; i++){
//            sum += (((i+1)*(l-i)+1)/2)*arr[i];
//        }
//        return sum;

    }
}
