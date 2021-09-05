package javapractice;

import java.util.Arrays;

public class RunDataTypes {
    public static void main(String[] args) {
      /*  boolean boolVal = true;
        byte byteVal = 8;
        short shortVal =2;
        char charVal = 'A';
        int intVal = 4;
        long longVal = 1467565645L;
        float floatVal = 3.3f;
        double doubleVal =4444.666d;*/

        String[] strArray = {"Volvo", "BMW", "Audi", "Porsche"};

        String strArr = Arrays.toString(strArray);

        System.out.println(strArr);

        strArray[0]="Ferrari";
        String strArr2 = Arrays.toString(strArray);
        System.out.println(strArr2);




    }
}
