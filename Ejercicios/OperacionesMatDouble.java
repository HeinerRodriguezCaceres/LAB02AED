package Ejercicios;

public class OperacionesMatDouble implements Operable<Double> {
	private Double valor;
	
	public OperacionesMatDouble(Double valor) {
		this.valor = valor;
	}
	@Override
	public Double suma(Double objeto) {
		return valor + objeto;
	}
	
	@Override
	public Double resta(Double objeto) {
		return valor - objeto;
	}
	
	@Override
	public Double producto(Double objeto) {
		return valor * objeto;
	}
	
	@Override
	public Double division(Double objeto) {
		return objeto != 0 ? valor / objeto : null;
	}
	@Override
    public Double potencia(Double objeto) {
        return Math.pow(valor, objeto);
    }

    @Override
    public Double raizCuadrada() {
        return Math.sqrt(valor);
    }

    @Override
    public Double raizCubica() {
        return Math.cbrt(valor);
    }

}
