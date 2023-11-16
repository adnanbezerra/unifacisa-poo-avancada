package abstratas;

public abstract class Personagem {
  protected String nome;
  protected int nivel;
	protected int forca;
	protected int inteligencia;
	protected int agilidade;
	protected int vida;
	protected int defesa;

	public abstract int causarDano();
	public abstract void levelUp();

	public Personagem(String nome, int nivel, int forca, int inteligencia, int agilidade, int vida, int defesa) {
		this.nome = nome;
		this.nivel = nivel;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.agilidade = agilidade;
		this.vida = vida;
		this.defesa = defesa;
	}

}
