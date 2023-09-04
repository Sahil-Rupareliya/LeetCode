package OOPs;

import java.util.Arrays;

public class Practice_4 {
    public static void main(String[] args) {
        student[] students = new student[5];
        students[0] = new student(1,"sahil",67,45,75);
        students[1] = new student(1,"Krish",78,54,85);
        students[2] = new student(1,"Jenish",95,85,75);
        students[3] = new student(1,"Kevin",70,80,90);
        students[4] = new student(1,"Harsh",67,45,75);

        student.getTop3Student(students);
    }
}

class student{
    private  int rollNo;
    private String Name;
    private int marks1;
    private int marks2;
    private int marks3;
    private double percentile;

    student(int rollNo,String name, int marks1, int marks2, int marks3){
        this.rollNo = rollNo;
        this.Name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.percentile = (marks1+marks2+marks3)/3;
    }

    static void  getTop3Student(student[] students){ // 45 25 52 15
        for(int i=0; i<students.length-1; i++){
            for(int j=0; j< students.length-i-1; j++){
                if(students[j].percentile < students[j+1].percentile){
                    student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        student max = students[0];
        student max1 = students[1];
        student max2 = students[2];

        System.out.println(max.Name + " " + max.percentile);
        System.out.println(max1.Name + " " + max1.percentile);
        System.out.println(max2.Name + " " +max2.percentile);

    }

}