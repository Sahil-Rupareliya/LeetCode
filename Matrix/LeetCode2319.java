package Matrix;

public class LeetCode2319 {
    public static void main(String[] args) {
        int[][] grid = {{6,0,0,0,0,0,0,18},
                        {0,17,0,0,0,0,18,0},
                        {0,0,13,0,0,17,0,0},
                        {0,0,0,9,18,0,0,0},
                        {0,0,0,2,20,0,0,0},
                        {0,0,20,0,0,3,0,0},
                        {0,14,0,0,0,0,11,0},
                        {19,0,0,0,0,0,0,9}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i == j  || (i+ j) == grid[0].length-1){
                    if(grid[i][j] == 0) {
                        System.out.println(false);
                        return;
                    }
                }else if(grid[i][j] != 0){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);

    }
}
