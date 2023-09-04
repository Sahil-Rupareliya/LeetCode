package array;

public class arrayFunctions {
    public static void main(String[] args) {
        int p =0;
        int[] arr = new int[5];
        isEmpty(p);
        p = insert(arr,p,10);
        p = insert(arr,p,20);
        p = insert(arr,p,30);
        System.out.println("Size is " + size(p));
        p = insert(arr,p,40);
        p = insert(arr,p,50);
        p = insert(arr,p,60);


        print(arr,p);
        System.out.println(find(arr,30, p));
        update(arr,p,30,300);
        System.out.println("After update : ");
        print(arr,p);
        p  =  delete(arr,p,300);
        print(arr,p);
    }

    private static int delete(int[] arr, int p, int val) {
        for(int i=0; i<p; i++){
            if(arr[i] == val){
                for(int j=i; j<p-1; j++){
                    arr[j] = arr[j+1];
                }
                p--;
            }
        }
        return p;
    }

    private static int size(int p) {
        return p;
    }

    private static void isEmpty(int p) {
        if(p==0){
            System.out.println("Empty");
        }else{
            System.out.println("Not Empty");
        }
    }

    private static void update(int[] arr,int p, int old, int newval) {
        for(int i=0; i<p; i++){
            if(arr[i]==old){
                arr[i]  = newval;
                return;
            }
        }
    }

    private static boolean find(int[] arr, int value, int p) {
        for(int i=0; i<p; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }


    private static void print(int[] arr, int p) {
        for(int i=0; i<p; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int insert(int[] arr, int p, int value) {
        if(p == arr.length){
            System.out.println("Array is full");
            return p;
        }
        arr[p] = value;
        return ++p;
    }
}
