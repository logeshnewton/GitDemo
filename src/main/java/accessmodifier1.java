public class accessmodifier1 {
    public void logi(){
        System.out.println("accessmodifier1");
    }
    void singapore(){
        System.out.println("singapore");
    }
    public void thailand(){
        System.out.println("thailand");
    }
    public static void main(String args[]){
        accessmodifier1 ac1=new accessmodifier1();
        ac1.singapore();
        ac1.logi();
    }



}
