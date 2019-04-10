package entorns;

public class PilaArray {

    private static int[] pila = new int[0];
    
    public static void push(int num){
        int[] aux = new int[pila.length+1];
        
        for(int i=0;i<pila.length;i++)
            aux[i]=pila[i];
        
        aux[pila.length]=num;
        
        pila=aux;
    }
    
    public static void pop(){
        if(pila.length>0){
            int[] aux = new int[pila.length-1];

            for(int i=0;i<aux.length;i++)
                aux[i]=pila[i];

            pila=aux;
        }
    }
    
    public static boolean isEmpty(){
        return pila.length==0;
    }
    
    public static int top(){
        return pila[pila.length-1];
    }
}
