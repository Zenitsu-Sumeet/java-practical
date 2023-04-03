

class join extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(" sumeet smart hai");
                Thread.sleep(1000);
            }
        }catch(InterruptedException i){

        }
    }
}
public class threadlife {
    public static void main(String[] args) throws InterruptedException {
        join t = new join();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("komal pagal hai");
            Thread.sleep(1000);
        }
    }
    
}
