package Matrix;

public class LeetCode1351 {
    public static void main(String[] args) {
        int[][] grid = {{3,2},{1,0}};
        int count =0;

        for (int i=0; i< grid.length; i++) {
            if(firstnegative(grid[i]) != -1)
            count += grid[i].length - firstnegative(grid[i]);
        }
        System.out.println(count);
    }

    public static int firstnegative(int[] arr){
        int first = 0;
        int target = -1;
        int last = arr.length-1;
        while(first <= last){
            int mid = (first+last)/2;
            if(arr[mid] < 0){
                target = mid;
                last  = mid-1;
            }else{
                first = mid + 1;
            }
        }
        return target;
    }
}
