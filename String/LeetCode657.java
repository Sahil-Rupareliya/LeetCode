package String;

public class LeetCode657 {
    public static void main(String[] args) {
        String  moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int idx1 = 0;
        int idx2 = 0;

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                idx1  -= 1;
            }else if(moves.charAt(i) == 'D'){
                idx1 += 1;
            }else if(moves.charAt(i) == 'L'){
                idx2 -= 1;
            }else{
                idx2 += 1;
            }
        }
        if(idx1==0 && idx2==0){
            return true;
        }
        return false;
    }
}
