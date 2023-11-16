package abstratas;

public class Arqueiro extends Personagem {
	public Arqueiro(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
		super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.agilidade;
	}
}
