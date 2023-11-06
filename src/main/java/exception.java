public class exception {

    public static void main(String args[]){
        try{
            //int arr[]=new int[5];
            System.out.println("arr[7]");
        }
       /* catch(Exception e){
            System.out.println(e);
        }*/
        finally {
            int arr[]=new int[5];
            arr[4]=10;
            System.out.println(arr[4]);
        }
    }
}
