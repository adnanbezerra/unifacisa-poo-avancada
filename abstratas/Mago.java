package abstratas;

public class Mago extends Personagem {
	public Mago(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
		super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.inteligencia;
	}
}
