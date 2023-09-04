package Binary_Search;

public class LeetCode540 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        int left  = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                System.out.println(arr[mid]);
                return ;
            }
            if (mid % 2 == 00) {
                if(arr[mid] != arr[mid+1]){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid] == arr[mid-1]){
                    left = mid+1;
                }else{
                    right = mid;
                }
            }

        }
        System.out.println(arr[left]);
    }
}
