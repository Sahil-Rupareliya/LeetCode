package Matrix;

public class SearechRowColSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{3,5,8},{5,7,9},{7,9,11}};
        int start = 0;
        int end = matrix[0].length-1;
        int target = 10;
        while(start != matrix.length-1 && end != 0){
            if(matrix[start][end] == target){
                System.out.println("Present at :" +"[" + start + "," + end + "]");
                return;
            }else if(matrix[start][end] > target){
                end -= 1;
            }else{
                start +=1;
            }
        }
        System.out.println("NOt Present");
    }
}
