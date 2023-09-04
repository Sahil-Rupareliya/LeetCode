package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1496 {
    public static void main(String[] args) {
        String path = "ENNNNNNNNNNNEEEEEEEEEESSSSSSSSSS";
        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        set.add("00");
        int x = 0;
        int y = 0;

        for(char ch : path.toCharArray()){
            if(ch == 'N')y++;
            if(ch == 'S')y--;
            if(ch == 'E')x++;
            if(ch == 'W')x--;

            String temp = ""+x+""+y;
            if(set.contains(temp))return true;
            else set.add(temp);
        }
        System.out.println(set);
        return false;
    }
}
