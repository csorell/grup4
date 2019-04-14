package entorns.Empleas;

public class AdministrarEmpleados {
    
   public static float calcularSalarioBruto(TipoEmpleat e) throws Exception{
       float salari = 0;
       
       if (e==null || e.getVentasMes()<0 || e.getHorasExtra()<0 )
           throw new Exception();
       
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
   
   public static float calcularSalariNet(TipoEmpleat e) throws Exception{
       
       if (e==null || e.getSalarioBruto()<0 )
           throw new Exception();
       
       if(e.getSalarioBruto()>=1500)
           return (float) (e.getSalarioBruto() * 0.82);
       else if(e.getSalarioBruto()>=1000)
           return  (float) (e.getSalarioBruto()*0.84);
       
       return e.getSalarioBruto();
   }

}
