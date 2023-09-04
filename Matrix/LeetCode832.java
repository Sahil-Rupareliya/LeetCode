package Matrix;

import java.util.Arrays;

public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int i=0; i< image.length; i++){
            int start = 0;
            int end = image[i].length-1;
            while(start < end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
            for (int j = 0; j < image.length; j++) {
                if(image[i][j] == 1) image[i][j] = 0;
                else if(image[i][j] == 0)image[i][j] = 1;
            }
        }
        for(int i=0;i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                System.out.print(image[i][j] +  " ");
            }
            System.out.println();
        }
    }
}
