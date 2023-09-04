package String;

public class LeetCode2678 {
    public static void main(String[] args) {
        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        int count = 0;
        for(int i=0; i<details.length; i++){
            if((details[i].charAt(11) >= '6' && details[i].charAt(12) >= '1') || ((details[i].charAt(11) >= '7'))){
                count++;
            }
        }
        System.out.println(count);
    }
}
