package Sorting;

public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3}};
        int start = 0;
        int end = matrix.length-1;
        int target = 3;
        int targetedRaw = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length-1] >= target){
                targetedRaw = mid;
                break;
            }else if(matrix[mid][0] > target){
                end = mid-1;
            }else if(matrix[mid][0] < target){
                start = mid+1;
            }
        }
        if(targetedRaw == -1){
            System.out.println(false);
            return;
        }

        int left = 0;
        int right  =matrix[0].length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(matrix[targetedRaw][mid] == target){
                System.out.println(true);
                return;
            }else if(matrix[targetedRaw][mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(false);
    }
}
