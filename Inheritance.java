class person{
    void Kelakukan(){
        System.out.println("Manusiawi");
    }
}
class person2 extends person{
    void Kelakukan2(){
        System.out.println("Baik");
    }
}
class person3 extends person2{
    void Kelakukan3(){
        System.out.println("suka membantu");
    }
}

public class inheritance {
    public static void main(String[] args) {
        person3 p = new person3();
        p.Kelakukan();
        p.Kelakukan2();
        p.Kelakukan3();        
    }
}
