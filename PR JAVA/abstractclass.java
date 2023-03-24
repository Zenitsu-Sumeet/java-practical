abstract class test{
    abstract void add();
}
class service extends test{
    void add(){
        System.out.println("abstract method");
    }
    public void m1(){
        System.out.println("method");
    }
    public void m2(){
        System.out.println("class method 2");

    }
}
public class abstractclass {
    public static void main(String[] args) {
        service s = new  service();
        s.add();
        s.m1();
        s.m2();
    }
}
