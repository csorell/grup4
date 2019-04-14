package entorns.Empleas;

public abstract class TipoEmpleat {

    private float ventasMes;
    private float horasExtra;
    private float salarioBruto;
    private float salarioNeto;

    public TipoEmpleat( float ventasMes, float horasExtra) {
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
    }

    
    
    //Setters
    
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
    
    
}
