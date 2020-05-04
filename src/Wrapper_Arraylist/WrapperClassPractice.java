package Wrapper_Arraylist;

import java.util.Arrays;

public class WrapperClassPractice {
    public static void main(String[] args) {
        String[] arr={"1","23","4","41"};
        int max=0;
        for (String each:arr) {
            int num=Integer.parseInt(each);
            if (num>max){

                max=num;
        }
    }
        System.out.println(max);


        String[] sa={"1","41","3","5"};
        int[] as=new int[sa.length];
        for (int i = 0; i <sa.length ; i++) {
            as[i]=Integer.parseInt(sa[i]);

        }
        System.out.println(Arrays.toString(as));


    }
}
