// Min Element in two Arrays in O(1);

package Stack;

import java.util.Stack;

public class StackMinO1 {
    static int[] stack = new int[5];
    static int[] Minstack = new int[5];
    static int top =-1;
    static int Mintop =-1;

    public static void main(String[] args) {
        push(20);
        push(20);
        push(10);
        push(40);
        pop();
        System.out.println(CurrentMin());
    }

    private static int CurrentMin() {
        if(Mintop == -1){
            return -1;
        }
        return Minstack[Mintop];
    }

    private static void pop() {
        if(top < 0){
            return;
        }
        top--;
        if(Minstack[Mintop] >= stack[++top]){
            Mintop--;
        }
    }

    private static void push(int i) {
        if(top > 4){
            return;
        }
        top++;
        stack[top] = i;
        if(Mintop==-1){
            Minstack[++Mintop] = i;
        }else{
            if(i < Minstack[Mintop]){
                Minstack[++Mintop] = i;
            }
        }
    }
}