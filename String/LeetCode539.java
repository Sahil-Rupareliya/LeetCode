package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode539 {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("04:00");
        timePoints.add("22:00");
        System.out.println(findMinDifference(timePoints));

    }

    public static int findMinDifference(List<String> timePoints) {
        int[] arr =  new int[timePoints.size()];
        for(int i=0; i<timePoints.size(); i++){
            arr[i] = (Integer.parseInt(timePoints.get(i).substring(0,2))*60)+(Integer.parseInt(timePoints.get(i).substring(3,5)));
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int diff = arr[i]-arr[i-1];
            int minimun = Math.min(Math.abs(diff-0),Math.abs(diff-1440));
            min = Math.min(min,minimun);
        }
        int diff = arr[arr.length-1]-arr[0];
        int minimun = Math.min(Math.abs(diff-0),Math.abs(diff-1440));
        min = Math.min(min,minimun);
        return min;
    }
}
