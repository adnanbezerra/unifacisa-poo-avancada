package abstratas;

public class Guerreiro extends Personagem {
	public Guerreiro(String nome) {
		super(nome);
		this.forca = 12;
		this.defesa = 16;
		this.inteligencia = 4;
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.forca;
	}
}
