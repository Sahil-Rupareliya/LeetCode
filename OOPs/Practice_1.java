package OOPs;

public class Practice_1 {
    public static void main(String[] args) {
            Student s1 = new Student();
            s1.setStudDetails(1,"Sahil",35,45,49);
            s1.calculateTotal();
            s1.displayStudDetails();
    }
}

class Student{
    int rollNum;
    String  student_Name;
    int Marks_1;
    int Marks_2;
    int Marks_3;
    int TotalMArks;


    void setStudDetails(int rollNum, String student_Name, int marks_1, int marks_2, int marks_3) {
        this.rollNum = rollNum;
        this.student_Name = student_Name;
        this.Marks_1 = marks_1;
        this.Marks_2 = marks_2;
        this.Marks_3 = marks_3;
    }

    void calculateTotal(){
        TotalMArks = Marks_1 + Marks_2 + Marks_3;
    }

    void displayStudDetails(){
        System.out.println(rollNum);
        System.out.println(student_Name);
        System.out.println(TotalMArks);
    }

}
