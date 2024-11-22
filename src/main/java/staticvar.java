public class staticvar {

    String name;
   static String address;
    static String city= "malaysia";
    public  staticvar(String name,String address){
        this.name=name;
        this.address=address;
         this.city=city;
      //  System.out.println("name:"+name +","+"address:"+address+","+"city:"+city);

    }
    public static void getAddress(){
        System.out.println("address:"+address+","+"city:"+city);
    }


    public static void main(String[] args){

       staticvar ss = new staticvar("logesh","solinganallur");
        staticvar sss = new staticvar("newton","madhuravayal");
        ss.getAddress();
        sss.getAddress();
        System.out.println(staticvar.address="dharmapuri");
    }

}
