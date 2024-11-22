public class abstractionss implements abstraction1,abstracted{
    public static void main(String args[]){
        abstractionss s=new abstractionss();
        s.arun();
        s.sujan();
       s.logesh();
        s.kajini();
        s.escape();

    }

    @Override
    public void logesh() {
        System.out.println("lovely boy");
    }

    @Override
    public void arun() {
        System.out.println("hemy jackason");

    }
    public void kajini(){
        System.out.println("gajini");
    }

    @Override
    public void sujan() {

        System.out.println("super boy");
    }

    @Override
    public void escape() {
        System.out.println("mahesh");
    }
}
