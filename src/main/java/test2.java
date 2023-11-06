public class test2 extends Test{
    String sasi="Indian Administration Service";
    public test2(){
        //super();
        String sasi="manikumar";
        System.out.println(this.sasi);
    }
    public void mains(){
        System.out.println(super.sasi);
    }
    public void logesh(){
        super.logesh();
        System.out.println("dtaa");
    }

    public static void main(String args[]){
       test2 ss=new test2();
     //  ss.mains();
    //  ss.logesh();

    }


}
