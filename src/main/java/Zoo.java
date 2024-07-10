
import java.util.*;

public class Zoo {

    public static void main (String[]arg){







        int num0 = 0;
        int num1 = 1;
        int num2;


        System.out.print(" "+ num0 );
        System.out.print(" "+ num1+" "  );
        for(int i = 3; i <= 10; i++){
            num2 = num0 + num1;


            System.out.print(num2 + " ");

            num0 = num1;
            num1 = num2;
        }


    }

}



