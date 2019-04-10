package entorns.Empleas;

public class Encargado extends TipoEmpleats{
    private static final float SALARIO_BASE = 1500.00f;

    public Encargado( float ventasMes, float horasExtra) {
        super(SALARIO_BASE, ventasMes, horasExtra);
    }

}
