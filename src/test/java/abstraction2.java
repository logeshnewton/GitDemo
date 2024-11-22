 public class abstraction2 implements abstraction1{
    public static void main(String args[]){
        abstraction1 a=new abstraction2();
        a.logesh();
        a.arun();
        a.sujan();

    }

     @Override
     public void logesh() {

        System.out.println("logesh");
     }

     @Override
     public void arun() {
         System.out.println("arun");

     }

     @Override
     public void sujan() {
         System.out.println("sujan");

     }
 }
