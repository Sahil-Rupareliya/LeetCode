package String;

public class LeetCode1629 {
    public static void main(String[] args) {
        int[] releaseTimes = {12,23,36,46,62};
        String keysPressed = "spuda";
        System.out.println(slowestKey(releaseTimes,keysPressed));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int maxRelease = releaseTimes[0];
        for(int i=1; i<releaseTimes.length; i++){
            int diff = releaseTimes[i]- releaseTimes[i-1];
            if(diff == maxRelease){
                maxRelease = diff;
                if(ans <= keysPressed.charAt(i)){
                    ans = keysPressed.charAt(i);
                }
            }else if(diff > maxRelease){
                maxRelease = diff;
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
}
