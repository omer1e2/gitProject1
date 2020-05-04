package Wrapper_Arraylist;

public class MethodsofWrapperClass {
    public static void main(String[] args) {
        ///Parse Method
        String str="123";
        int ad=Integer.parseInt(str);
        ad+=3;
        str+=1;

        System.out.println(str);
        System.out.println(ad);
        /////////////////VALUE OF METHOD
        String st="3331";
        Integer a=Integer.valueOf(st);
        System.out.println(a+1);



    }
}
