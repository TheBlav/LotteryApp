package Interfaces;

public interface Printer {

    default void print (int i ){
        System.out.println(i);

    }

    default void print (Object o){
        System.out.println(o.toString());
    }
}
