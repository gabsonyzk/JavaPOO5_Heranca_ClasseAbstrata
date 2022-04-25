package entities;

public class Empresa extends Contribuinte{
	
	private Integer numeroDeFuncionario;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String nome, Double rendimentoAnual, Integer numeroDeFuncionario) {
		super(nome, rendimentoAnual);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
	
	public Integer getNumeroDeFuncionario() {
		return numeroDeFuncionario;
	}

	public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
		this.numeroDeFuncionario = numeroDeFuncionario;
	}



	@Override
	public double imposto() {
		if (numeroDeFuncionario <= 10) {
			return (rendimentoAnual * 1.16) - rendimentoAnual;
		}
		else {
			return (rendimentoAnual * 1.14) - rendimentoAnual;
		}
	}

}
