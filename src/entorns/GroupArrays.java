package entorns;

public class GroupArrays {

    
    public static int[] groupArrays(int[] array1, int[] array2){
        int[] res=new int[array1.length + array2.length];
        
        for(int i=0;i<array1.length;i++)
            res[i] = array1[i];
        
        for(int i=0;i<array2.length;i++)
            res[i+array1.length] = array2[i];
        
        return ordenarArray(res);
    }
    
    public static int[] ordenarArray(int[] array){
        int aux;
        
        for(int i=0;i<array.length;i++)
            for(int a=0;a<array.length-i-1;a++)
                if(array[a]>array[a+1]){
                    aux = array[a];
                    array[a] = array[a+1];
                    array[a+1] = aux;
                }
            
        return array;
    }
}
