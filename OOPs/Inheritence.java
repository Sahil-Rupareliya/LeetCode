package OOPs;

public class Inheritence {
    public static void main(String[] args) {
        a.setter();
    }
}

class a{
     static void setter(){
        System.out.println("This is class a's setter method.");
    }
}


class b extends a{

    void setter1(){
        System.out.println("This is class b's setter method.");
    }
}


