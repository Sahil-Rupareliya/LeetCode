package array;

public class LeetCode2079 {
    public static void main(String[] args) {
        int[] plants ={7,7,7,7,7,7,7};
        int capacity = 8;
        System.out.println(wateringPlants(plants,capacity));
    }

    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int temp = capacity;
        for(int i=0; i<plants.length-1; i++){
            if(temp < plants[i]){
                steps += (i*2);
                temp = capacity;
            }
            steps++;
            temp -= plants[i];
        }
        if(temp >= plants[plants.length-1]){
            steps++;
        }else{
            int plus= plants.length-1;
            steps += (plus*2)+1;
        }
        return steps;
    }
}
