public class loop {
    int s=1;
    public  void no(){
        System.out.println("break");
    }
    public static void main(String args[]){
        int k=1;
       for(int i=0;i<4;i++){
           for(int j=1;j<=1+i;j++){
               System.out.print(k);
               System.out.print("\t");
               k++;
           }
          System.out.println("");
       }
    }

}
