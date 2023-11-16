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

	public Personagem(String nome) {
		this.nome = nome;
		this.nivel = 1;
		this.vida = 100;
	}

}
