//MinStack in one Array first last concept.


package Stack;

public class MinStackInOneArray {
    static int[] arr = new int[50];
    static int top = -1;
    static int Mintop = 50;

    public static void main(String[] args) {
        push(6);
        push(14);
        push(10);
        push(2);
        MinStackValue();
        pop();
        MinStackValue();
    }

    static void push(int val){
        if(top+1 == Mintop){
            System.out.println("Stack is full");
            return ;
        }

        arr[++top] = val;
        if(Mintop == 50){
            arr[--Mintop] = val;
            return;
        }
        if(arr[Mintop] >= arr[top]){
            arr[--Mintop] = val;
        }
    }

    static void pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return;
        }
        if(arr[top] <= arr[Mintop]){
            Mintop++;
        }
        System.out.println("Popped value is :" + arr[top--]);
    }

    static void MinStackValue(){
        if(Mintop >= 50){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Min Value is : " + arr[Mintop]);
    }
}
