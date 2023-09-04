package LinkedList;

import java.util.List;
import java.util.Stack;

public class LeetCode2130 {
    public static void main(String[] args) {
        
    }

    public int pairSum(ListNode head) {
        Stack<Integer> reverse = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            reverse.push(temp.val);
            temp = temp.next;
        }

        int maxSum = 0;
        temp = head;
        for(int i=0; i<=reverse.size()/2; i++){
            int n = reverse.peek();
            int m = temp.val;
            temp = temp.next;
            reverse.pop();
            maxSum = Math.max(maxSum,n+m);
        }
        return maxSum;
    }

    public  class ListNode{
        int val;
        ListNode next;
        ListNode(){}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
