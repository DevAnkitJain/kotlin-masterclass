package samplecodes.interoperability.kotlinfromjava;

public class MyJava {
    public static void main(String[] args){
        int area = MyKotlinKt.area(4,5);
        System.out.println("printing area inside Java class returning from Kotlin file: "+area);
    }
}