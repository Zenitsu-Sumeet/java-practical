import java.io.*;

class Filewrite {

    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("abc");
     try{
        f.write("sumeet");
     }
     finally{
        f.close();
     }
     System.out.println("date done");
    }catch(IOException i){
        System.out.println(i);
    }
}
}
