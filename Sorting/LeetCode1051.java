package Sorting;

public class LeetCode1051 {
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }


    public static int heightChecker(int[] heights) {
        int max  = Integer.MIN_VALUE;
        for(int i: heights){
            if(i > max){
                max = i;
            }
        }

        int[] freq = new int[max+1];
        for(int i=0; i<heights.length; i++){
            freq[heights[i]]++;
        }


        int count =0;
        int j=0;
        for(int i=0; i<freq.length; i++){
            while(freq[i] > 0){
                if(heights[j] != i){
                    count++;
                }
                j++;
                freq[i]--;

            }
        }
        return count;
        // for(int i=0; i<heights.length; i++){
        //     if(heights[i] )
        // }
    }
}
