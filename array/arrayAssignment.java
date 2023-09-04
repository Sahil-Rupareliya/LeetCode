package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of First Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter First array elements");
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        //int last = sc.nextInt();

//        System.out.println("Enter Size of Second Array");
//        int m = sc.nextInt();
//        int[] arr2 = new int[m];
//        System.out.println("Enter Second array elements");
//        for (int i = 0; i < m; i++) {
//            arr2[i]  = sc.nextInt();
//        }
//        alternate(arr);                                //7. Print alternate element  8.odd elements first then even elements from array
//        largest(arr);                                  //9. Find largest (maximum) element from array
//        copy(arr);                                     //10. Copy array element in another array
//        reversecopy(arr);                              //11. Store array in reverse order in new array
//        commonelement(arr,arr2);                       //12. Find common elements between two arrays
//        reverseMemory(arr);                            //13
//        doublecopy(arr);                               //14.
//        twiceval(arr);                                 //15.
//        alternate3(arr);                               //16.
//        isDuplicate(arr);                              //18. 19.
//        allUnique(arr) ;                               //20. 21.
//        smallerNumbersThanCurrent(arr);                //22.
//        secondLargest(arr);                            //23.
//        thirdLargest(arr);                             //24.
//        segregate(arr);                                //25.
//        System.out.println(binarySearch(arr));         //26. 32.
//        pairWithSum(arr);                              //27.
//        moveAllZeroRight(arr);                         //28.
//        leftrotate(arr);                               //29.
//        missingelement(arr);                           //30.
//        duplicateElement(arr);                         //31.
//        reverseNumber();                               //33;
//        mergeSortedArray(arr);                         //34.
//        largestContiguosSum(arr);                       //35.
    }



    //7. Print alternate element  8.odd elements first then even elements from array
    public static void alternate(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){
                System.out.print(arr[i]);
            }
        }
    }

    //9. Find largest (maximum) element from array
    public static void largest(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //10. Copy array element in another array
    public static void copy(int[] arr){
        int[] copyArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        System.out.println("Copied Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copyArray[i] + " ");
        }
    }

    //11. Store array in reverse order in new array
    public static void reversecopy(int[] arr){
        int[] copyArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArray[arr.length-i-1] = arr[i];
        }
        System.out.println("Copied Array");
        for (int i =0; i< arr.length; i++) {
            System.out.print(copyArray[i] + " ");
        }
    }

    //12. Find common elements between two arrays  o(n2)
    public static void commonelement(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    //13. Reverse an array in memory  Time = o(n);
    public static void reverseMemory(int[] arr){
//        int len = arr.length;
//        for (int i = 0; i < len; i++,len--) {
//            int temp = arr[i];
//            arr[i] = arr[len-1];
//            arr[len-1] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }


    //14. Given an array arr, create another array arr2 with double the size of arr and copy arr element two times in arr2
    public static void doublecopy(int arr[]){
        int len = arr.length;
        int arr2[] = new int[2*len];
        for (int i = 0; i < len; i++) {
            arr2[i] = arr[i];
            arr2[len+i] = arr[i];
        }
        for (int i = 0; i < (2*len); i++) {
            System.out.print(arr2[i]);
        }
    }

    //15.Given an array arr, create another array arr2 with double the size of arr, create another array arr2 with all value twice
    public static void twiceval(int arr[]){
        int len = arr.length;
        int arr2[] = new int[2*len];
        int temp = 0;
        for (int i = 0; i < len; i++,temp+=2) {
            arr2[temp] = arr[i];
            arr2[temp+1] = arr[i];
        }
        for (int i = 0; i < (2*len); i++) {
            System.out.print(arr2[i]);
        }
    }


    //16. Arr1, arr2 same size -> arr3 alternative
    public static void alternate3(int arr[]){
        Scanner sc = new Scanner(System.in);
        int len = arr.length;
        int arr2[] = new int[len];
        int arr3[] = new int[2*len];
        for (int i = 0; i < len; i++) {
            arr2[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i <len ; i++,temp+=2) {
            arr3[temp] = arr[i];
            arr3[temp+1] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }

    //18. 19. Check if given number is duplicate or not  o(N)
    public  static void isDuplicate(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int n = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println("NUmber is Duplicate");
                return;
            }
        }
        System.out.println("Number is not Duplicate");
    }

//20.   Print all unique numbers from array
//21.   Print all duplicate numbers array
    public  static void allUnique(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i]+1){
                System.out.println(arr[i]+ " ");
            }
        }
    }

//22.  How Many Numbers Are Smaller Than the Current Number
    public static void smallerNumbersThanCurrent(int[] nums) {
        int[] arr =new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

// 23. Find 2nd largest element from array
    public static void secondLargest(int[] nums){
//        Arrays.sort(arr);
//        int secondLArgest = 0;
//        int i=0;
//        while(arr[i]  < arr[arr.length-1]){
//            secondLArgest  = arr[i];
//            i++;
//        }
//
//        System.out.println(secondLArgest);
        int max1;
        int max2;
        if(nums[0] > nums[1]){
            max1 = nums[0];
            max2 = nums[1];
        }else{
            max1 = nums[1];
            max2 = nums[0];
        }
        for(int i=2; i<nums.length; i++){ //1 2 3 4 5 6
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        System.out.println(max2);
    }

//24. Find 3rd largest element from array
    public static void thirdLargest(int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i:nums){
            if(i > max1){
                max3 = max2;
                max2 = max1;
                max1  = i;
            }else if(i > max2){
                max3 = max2 ;
                max2 = i;
            }else if(i > max3){
                max3 = i;
            }
        }
        System.out.println(max3);

    }

    //25. Segregate even and odd numbers
    public static void segregate(int[] arr){
//        int[] result = new int[arr.length];
//        int j=0;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]%2 != 0){
//                result[j] = arr[i];
//                j++;
//            }
//        }
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]%2 == 0){
//                result[j] = arr[i];
//                j++;
//            }
//        }
//        for (int i=0; i< result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] % 2 != 0){
                left++;
            }else if(arr[right] % 2 == 0){
                right--;
            }else{                                      // A=10, B=5
                arr[left] = arr[left] + arr[right];    //A = 10 + 5 =15
                arr[right] = arr[left] - arr[right];   //B = 15 - 5 = 10
                arr[left] = arr[left] - arr[right];    //A = 15 - 10 = 5
                left++;
                right--;
            }
        }
        for (int i:arr ) {
            System.out.print(i + " ");
        }
    }

    //26. 32. Find element -> simple and binary search
    public static int binarySearch(int[] arr){ //(1,2,3,4,5)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Search value");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid-1;
            }
        }
        return -1;
    }
//27. Pair with sum present or not? Two pointers

    public static void pairWithSum(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sum :");
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.println("Target fount at "+ left +  "," + right); // 1 2 3 4 5 6
                return;
            }else if(arr[left] + arr[right] > target){
                right--;
            }else if(arr[left] + arr[right] < target){
                left++;
            }
        }

        System.out.println("Pair with sum not found ");
    }

//28. Move all 0 to right and 1s to left
    public static void moveAllZeroRight(int[] arr){
//        int[] arr2 = new int[arr.length];
//        int j = arr.length-1;
//        int k = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                arr2[j] = arr[i];
//                j--;
//            }else{
//                arr2[k] = arr[i];
//                k++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
        int left = 0;           // 0 1 1 0 1 0 1
        int right = arr.length-1;
        while(left < right){
            if(arr[left] == 1){
                left++;
            }else if(arr[right] == 0){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

//29. Left rotate an array by d positions
    public static void leftrotate(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter D for rotating ");
        int d = sc.nextInt();
//        int result[] = new int[arr.length];
//        for (int i = 0; i < arr.length-d; i++) {
//                result[i] = arr[i+d];
//        }
//        for (int i =arr.length-d; i <arr.length ; i++) {
//            result[i] = arr[i-d];
//        }
//        for (int i=0; i<result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        reverseArr(arr, 0,d-1);
        reverseArr(arr, d,arr.length-1);
        reverseArr(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    public static void reverseArr(int[] arr ,int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//30. 1 to n-1 in an array : 1 number is missing -> find out
    public static void missingelement(int[] arr){
//        Scanner sc = new Scanner(System.in);
        int n = arr.length+1;
//        int[] arr = new int[n-1];
//        for(int i=0; i<n-1; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] != i+1){
//                System.out.println("Missing number is " + (i+1));
//                break;
//            }
//        }
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            sum2  += arr[i];
        }

        System.out.println(sum-sum2);
    }

//31. 1 to n in an array : 1 number is duplicate -> find out
    public static void duplicateElement(int[] arr){
        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            if(arr[i] == arr[i-1]){
//                System.out.println("Duplicate number is " + (arr[i]));
//                break;
//            }
//        }
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 += arr[i];
        }
        System.out.println(sum-sum2);
    }

//33. Reverse a number
    public static void reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int reverse = 0;
        while(number >0){
            int temp = number % 10;
            reverse =  (reverse *10) + temp;
            number /= 10;
        }
        System.out.println("Reverse number : " + reverse);
    }

//34. Merge two sorted array
    public static void mergeSortedArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {  // 1,2,3,0,0,0    2,4,5
            arr2[i] = sc.nextInt();
        }
        int m = 2;
        int n = 2;
        int k = arr.length-1;
        while(m >=0 && n >= 0){
            if(arr[m] > arr2[n]){
                arr[k] = arr[m];
                k--;
                m--;
            }else{
                arr[k] = arr2[n];
                n--;
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//35. Largest contiguous sum
    public static void largestContiguosSum(int[] arr){
        int max = 0;
        int continueos_sum = 0;
        for(int i :arr){
            continueos_sum += i;
            if(continueos_sum < 0){
                continueos_sum = 0;
            }
            if(continueos_sum > max){
                max = continueos_sum;
            }
        }
        System.out.println(max);
    }
}
