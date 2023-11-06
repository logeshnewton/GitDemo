public class overloading {

    public void logesh(int love){
        System.out.println(love);

    }
    public void logesh(String love){
        System.out.println(love);

    }
    public void logesh(String love,String lovely){
        System.out.println(lovely+" "+love);

    }
    public static void main(String args[]){
        overloading load=new overloading();
        load.logesh("lovely boy");
        load.logesh(100);
        load.logesh("no love","dummy love");
    }
}
