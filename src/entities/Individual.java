package entities;

public class Individual extends Contribuinte{
	
	private Double gastosComSaude;
	
	
	public Individual() {
		super();
	}

	public Individual(String nome, Double rendimentoAnual, Double gastosComSaude) {
		super(nome, rendimentoAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		if (rendimentoAnual <=20000) {
			return (rendimentoAnual * 1.15) - (gastosComSaude * 0.50) - rendimentoAnual;
		}
		else {
			return (rendimentoAnual * 1.25) - (gastosComSaude * 0.50) - rendimentoAnual;
		}
		
	}

}
