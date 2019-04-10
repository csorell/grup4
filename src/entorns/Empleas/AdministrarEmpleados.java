package entorns.Empleas;

import com.sun.jmx.snmp.BerException;

public class AdministrarEmpleados {
    
   public static float calcularSalarioBruto(TipoEmpleat e) throws BerException{
       float salari = 0;
       
       if (e==null || e.getVentasMes()<0 || e.getHorasExtra()<0 )
           throw new BerException();
       
       if(e instanceof Vendedor)
           salari = 1000;
       else if (e instanceof Encargado)
           salari = 1500;
       
       if(e.getVentasMes()>=1500)
           salari += 200;
       else if(e.getVentasMes()>=1000)
           salari += 100;
       
       salari += (e.getHorasExtra()*20);
       
       return salari;
   }
   
   public static float calcularSalariNet(TipoEmpleat e){
       
       if(e.getSalarioBruto()>=1500)
           return (float) (e.getSalarioBruto() * 0.82);
       else if(e.getSalarioBruto()>=1000)
           return  (float) (e.getSalarioBruto()*0.84);
       
       return e.getSalarioBruto();
   }

}
