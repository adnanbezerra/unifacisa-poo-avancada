package abstratas;

public class Mago extends Personagem {
	public Mago(String nome) {
		super(nome);
		this.inteligencia = 12;
		this.defesa = 6;
		this.agilidade = 4;
	}

	public void levelUp() {
		this.nivel++;
	}

	public int causarDano() {
		return this.nivel + this.inteligencia;
	}
}
