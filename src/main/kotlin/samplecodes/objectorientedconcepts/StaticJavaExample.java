package samplecodes.objectorientedconcepts;

public class StaticJavaExample {

    int nonStatic = 90;
    static int staticVariable = 90;
    public static void main(String args[]){
        System.out.println(StaticJavaExample.staticVariable);
        System.out.println(new StaticJavaExample().nonStatic);
        StaticJavaExample.greet();
    }

    public static void greet(){
        System.out.println("Static Function");
    }


}
