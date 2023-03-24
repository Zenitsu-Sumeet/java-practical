class komal{
    public void mgs(){
        System.out.println("the base class");
    }
}
class Sumeet extends komal{
    public void mgs1(){
        System.out.println("dervid");
    }
}
public class singlelevel {
    public static void main(String[] args) {
        Sumeet harsh = new Sumeet();
        harsh.mgs();
        harsh.mgs1();
    }
}
