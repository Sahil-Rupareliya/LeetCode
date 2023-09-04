package HashMap;
import  java.util.*;

public class Custom {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student(1,"Sahil");
        Student s2 = new Student(1,"Sahil");
        Student s3 = new Student(1,"Sahil");
        Student s4 = new Student(2,"Sahil");
        Student s5 = new Student(2,"Sahil");
        Student s6 = new Student(2,"sahil");
        Student s7 = new Student(1,"Sahil");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);

        System.out.println(set);

        for(Student s : set){
            System.out.print(s.id + " ");
            System.out.println(s.name);
        }
    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode(){
        final int prime = 35;
        int result = 50;
        result = prime * result + id;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // type casting of the argument.
        Student other = (Student)obj;

        // comparing the state of argument with
        // the state of 'this' Object
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }
}
