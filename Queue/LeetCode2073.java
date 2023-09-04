package Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode2073 {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,0};
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets,k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int pointer = 0;
        Queue<Integer> queue = new LinkedList<>();
        while(tickets[k] != 0){
            if(pointer == tickets.length){
                pointer = 0;
            }
            if(tickets[pointer] != 0){
                tickets[pointer++]--;
                time++;
            }else{
                pointer++;
            }
        }
        return time;
    }
}
