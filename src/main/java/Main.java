import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*    WebDriver driver=new ChromeDriver();

        driver.get("https://mwstourstravels.sg/tourPackage");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();*/
        int a=10;
        int b=20;
        int c=a+b;
        String logesh ="nice person";
        char jack='h';
        double s=3.9;
        float g=3.4f;
        int[] arr =new int[5];

        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        arr[4]=9;

        int[] log={12,16,37,98,92};
        String[] jhonny={"mahesh","dhanush","suresh","kanesh","vikram"};
       /* for(int i=0;i<jhonny.length;i++)
        {
            System.out.println(jhonny[i]);
        }*/
      /*  for(int l:log){
            if(l%2==0){
                System.out.println("odd:"+l);
                //break;
            }else
            System.out.println("l:"+l);

        }*/
       // System.out.println("log"+log[0]);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(1);
        obj.add(8);
        obj.add(10);
        obj.add(5);
       // obj.remove(2);
       // System.out.println(obj.get(2));
    /*    for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }*/
       /* for(Integer lovely:obj)
        {
            System.out.println(lovely);
        }*/
      List<String> sachin= Arrays.asList(jhonny);
       System.out.println(sachin.contains("sresh"));
       String java=("ashok kumar kneshess mahesh madhan");
       System.out.println("Java llength:"+java.length());
     /* String[] mani=java.split("kumar");
       System.out.println(mani[0]);
       // System.out.println(mani[1]);
        System.out.println(mani[1].trim());
       String[] mami=mani[1].split(" ");
        System.out.println(mami[0]);
        System.out.println(mami[1]);
        String[] sss=mami[1].split("e");
        System.out.println(sss[0]);
        System.out.println(sss[1]);
        System.out.println(sss[2]);*/

        for(int i=java.length()-30;i>=0;i--){
          String[] baby=java.split(" ");
          System.out.println(baby[i]);
        }




        // System.out.println(mami[2]);
       // System.out.println(mami[3]);


      /*  System.out.println("arr"+arr[3]);

        System.out.println("char value:"+jack);
        System.out.println("double value:"+s);
        System.out.println("float:"+g);
        System.out.println("Hello world!");*/
    }
    public static void newton()
    {
        String ashok="lovely Logesh is the best common man";
        String [] test=ashok.split(" ");
        System.out.println(test[0]);
        System.out.println(test[1]);
        System.out.println(test[2]);
        System.out.println(test[3]);
        System.out.println(test[4]);
        System.out.println(test[5]);
        //return 7;

        // System.out.println("lovely Logesh");
    }

}