package CP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cardSwipe {
    public static void main (String[] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i]=  sc.nextInt();
        }
        List<Integer> arrList = new ArrayList<>();
        int inOffice = 0;
        int MaxinOffice = 0;
        for(int i=0; i<arr.length; i++){
            Integer remove = arr[i];
            if(!arrList.contains(remove)){
                arrList.add(remove);
                inOffice++;
                MaxinOffice = Math.max(inOffice, MaxinOffice);
            }else{
                arrList.remove(remove);
                inOffice--;
                MaxinOffice = Math.max(inOffice, MaxinOffice);
            }
        }
        System.out.println(MaxinOffice);
    }
}
