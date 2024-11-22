import com.sun.security.jgss.GSSUtil;
import org.checkerframework.checker.units.qual.K;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class array {
    public static void main(String args[]){
        int l[][]=new int[3][3];
        l[0][0]=2;
        l[0][1]=4;
        l[0][2]=5;
        l[1][0]=6;
        l[1][1]=7;
        l[1][2]=8;
        l[2][0]=10;
        l[2][1]=12;
        l[2][2]=214;
        System.out.println(l[2][1]);
        Date date=new Date();
        Calendar calendar=Calendar.getInstance();
        System.out.println( calendar.get(Calendar.DAY_OF_WEEK));
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/y");
        SimpleDateFormat sdfs=new SimpleDateFormat("M/d/y hh:mm:ss");

        System.out.println(sdf.format(date));
        System.out.println(sdfs.format(date));
        System.out.println(date);
        int m[][]={{1,8,7},{0,5,1},{9,0,7}};
        int s=m[0][0];
      //  int min;
        int minicolumn=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[i][j]<s){
                    s=m[i][j];
                    minicolumn=j;
                  //  System.out.println("max:"+  m[i][j]);
                }


            }
           // System.out.println("  ");
        }
        int max=m[0][minicolumn];
        int k = 0;
        while (k < 3){
            if(m[k][minicolumn]>max){
                max=m[k][minicolumn];
            }
            k++;
            

        }

        System.out.println(max);
    }
}
