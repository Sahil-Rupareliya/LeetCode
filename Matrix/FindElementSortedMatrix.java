package Matrix;

public class FindElementSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{2,4,6,8,9},{10,12,14,15,16},{17,19,20,22,23},{25,27,28,30,32}};
        int start = 0;
        int end = matrix.length-1;
        int target = 24;
        int targetedRow = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(matrix[mid][0] <= target && matrix[mid][matrix.length-1] >= target){
                targetedRow = mid;
                break;
            }else if(matrix[mid][0] > target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        if(targetedRow == -1){
            System.out.println("Not Present");
            return;
        }

        start = 0;
        end = matrix[0].length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(matrix[targetedRow][mid] == target){
                System.out.println("Found at :" + targetedRow + " " + mid);
                return;
            }else if(matrix[targetedRow][mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        System.out.println("Not Present");

    }
}
