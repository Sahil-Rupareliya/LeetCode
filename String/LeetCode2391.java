package String;

import java.util.Arrays;

public class LeetCode2391 {
    public static void main(String[] args) {
        String[]  garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
        System.out.println(garbageCollectionSecond(garbage,travel));
    }


    public static int garbageCollection(String[] garbage, int[] travel) {
        int glassSum = 0;
        int paperSum = 0;
        int metalSum = 0;
        int nextGlass = 0;
        int nextPaper = 0;
        int nextMetal = 0;

        for(int i=0; i<garbage.length; i++){
            for(int j=0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j) == 'G'){
                    glassSum += 1 + nextGlass;
                    nextGlass = 0;
                }else if(garbage[i].charAt(j) == 'P'){
                    paperSum += 1 + nextPaper;
                    nextPaper = 0;
                }else{
                    metalSum += 1 + nextMetal;
                    nextMetal = 0;
                }
            }
            if(i != garbage.length-1) {
                nextGlass += travel[i];
                nextMetal += travel[i];
                nextPaper += travel[i];
            }
        }
        return glassSum + metalSum + paperSum;
    }

    public static int garbageCollectionSecond(String[] garbage, int[] travel) {
        int[] prefixSum = new int[garbage.length];
        prefixSum[0] = 0;
        int lastOfPaper = 0;
        int lastOfMetal = 0;
        int lastOfGlass = 0;

        int sum = 0;
        for(String i:garbage){
            sum += i.length();
        }
        for (int i = 1; i < garbage.length; i++) {
            prefixSum[i] = prefixSum[i-1] + travel[i - 1];
        }
//        System.out.println(Arrays.toString(prefixSum));
        for(int i=0; i<garbage.length; i++){
            if(garbage[i].contains("P")){
                lastOfPaper = i;
            }
            if(garbage[i].contains("M")){
                lastOfMetal = i;
            }if(garbage[i].contains("G")){
                lastOfGlass = i;
            }

        }
        return prefixSum[lastOfGlass] + prefixSum[lastOfPaper] + prefixSum[lastOfMetal] + sum;
    }
}
