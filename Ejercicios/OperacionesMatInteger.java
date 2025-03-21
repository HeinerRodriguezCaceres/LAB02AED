package Ejercicios;

public class OperacionesMatInteger implements Operable<Integer>{
	private Integer valor;
	
	public OperacionesMatInteger(Integer valor) {
		this.valor = valor;
	}
	
	@Override
	public Integer suma(Integer objeto) {
		return valor + objeto;
	}
	
	@Override
	public Integer resta(Integer objeto) {
		return valor - objeto;
	}
	
	@Override
	public Integer producto(Integer objeto) {
		return valor * objeto;
	}
	@Override
	public Integer division(Integer objeto) {
		return objeto != 0 ? valor / objeto : null;
	}
	@Override
    public Integer potencia(Integer objeto) {
        return (int) Math.pow(valor, objeto);
    }

    @Override
    public Integer raizCuadrada() {
        return (int) Math.sqrt(valor);
    }

    @Override
    public Integer raizCubica() {
        return (int) Math.cbrt(valor);
    }

}
