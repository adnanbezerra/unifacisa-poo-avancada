package abstratas;

public class Arqueiro extends Personagem {
	public Arqueiro(String nome) {
		super(nome);
		this.agilidade = 12;
		this.defesa = 8;
		this.inteligencia = 10;
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.agilidade;
	}
}
