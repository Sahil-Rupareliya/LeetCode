package array;

public class LeetCode1539 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
//        int count = 0;
//        int i = 1;
//        int index = 0;
//        while (count < k) {
//            if (arr[index] != i) {
//                count++;
//            } else {
//                if (index != arr.length - 1) {
//                    index++;
//                }
//            }
//            i++;
//
//        }
//        System.out.println(i - 1);
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]-mid-1<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        System.out.println( left+k);
    }
}
