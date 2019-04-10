package entorns.Empleas;

public class TipoEmpleats {

    private float salarioBase;
    private float ventasMes;
    private float horasExtra;
    private float salarioBruto;
    private float salarioNeto;

    public TipoEmpleats(float salarioBase, float ventasMes, float horasExtra) {
        this.salarioBase = salarioBase;
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
    }

    
    
    //Setters
    public void setSalario(float salario){
        salarioBase = salario;
    }
    
    public void setVentasMes(float ventas){
        ventasMes = ventas;
    }
    
    public void setHorasExtras(int horas){
        horasExtra = horas;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setSalarioNeto(float salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
    
    //Geters
    public float getSalarioBase() {
        return salarioBase;
    }

    public float getVentasMes() {
        return ventasMes;
    }

    public float getHorasExtra() {
        return horasExtra;
    }
    
      public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getSalarioNeto() {
        return salarioNeto;
    }
    
    //Method

    public void CalcularSalarioBruto(){
        setSalarioBruto(salarioBase);
        
        if(ventasMes>=1000 && ventasMes<1500)
            setSalarioBruto(salarioBruto+100);
        
        else if(ventasMes>=1500)
            setSalarioBruto(salarioBruto+200);
        
        
    }
    
}
