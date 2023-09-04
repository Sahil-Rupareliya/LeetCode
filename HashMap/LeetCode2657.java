package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;

public class LeetCode2657 {
    public static void main(String[] args) {
        int[] a = {2,3,1};
        int[] b= {3,1,2};
//        int ans[] = {0,2,3,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a,b)));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(set.contains(A[i]))count++;
            if(set.contains(B[i]))count++;
            if(B[i] == A[i]) count++;
            set.add(A[i]);
            set.add(B[i]);
            ans[i] = count;
        }
        return ans;
    }
}
