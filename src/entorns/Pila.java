package entorns;

import java.util.ArrayList;


public class Pila {

    private static ArrayList<Integer> pila = new ArrayList<>();
    
    public static void push(int num){
        pila.add(num);
    }
    
    public static void pop(){
        pila.remove(pila.size()-1);
    }
    
    public static boolean isEmpty(){
        return pila.size()==0;
    }
    
    public static int top(){
        return pila.get(pila.size()-1);
    }

}
