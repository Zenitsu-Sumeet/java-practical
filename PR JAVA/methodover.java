class Sumeet{
    public void myone(){
        System.out.println("done with the one");
    }
}
class Komal extends Sumeet{
    public void myone(){
        System.out.println("i have one");
    }
}

public class methodover {
    public static void main(String[] args) {
    komal here = new komal();
    here.myone();
    }
}
