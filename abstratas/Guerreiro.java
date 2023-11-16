package abstratas;

public class Guerreiro extends Personagem {
	public Guerreiro(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
		super(nome, nivel, forca, inteligencia, agilidade, vida, defesa);
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.forca;
	}
}
