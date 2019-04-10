package entorns.Empleas;

public class Vendedor extends TipoEmpleats{

    private static final float SALARIO_BASE = 1000.00f;
    
    public Vendedor( float ventasMes, float horasExtra) {
        super(SALARIO_BASE, ventasMes, horasExtra);
    }

}
