package entorns;

import java.util.ArrayList;

public class Coa {
    
    private static ArrayList<Integer> coa = new ArrayList<>();
    
    public static void push(int num){
        coa.add(num);
    }
    
    public static void pop(){
        coa.remove(0);
    }
    
    public static boolean isEmpty(){
        return coa.size()==0;
    }
    
    public static int desencolar(){
        return coa.get(0);
    }


}
