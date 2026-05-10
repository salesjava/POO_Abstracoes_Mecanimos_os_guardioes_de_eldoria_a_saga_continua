package eldoria;

import java.util.Objects;

public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor completo
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        setNivel(nivel); // Usa o setter para validar
        setPontosDeVida(pontosDeVida); // Usa o setter para validar
        this.poderBase = poderBase;
    }

    // Getters e Setters com validação
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) {
        this.nivel = Math.max(nivel, 0); // Garante que não seja negativo
    }

    public int getPontosDeVida() { return pontosDeVida; }
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = Math.max(pontosDeVida, 0); // Garante que não seja negativo
    }

    public double getPoderBase() { return poderBase; }
    public void setPoderBase(double poderBase) { this.poderBase = poderBase; }

    // Método abstrato para ser implementado pelas subclasses (Polimorfismo)
    public abstract void usarHabilidade();

    // Sobrescrita de métodos herdados de Object
    @Override
    public String toString() {
        return String.format("Nome: %s\nClasse: %s\nNível: %d\nPontos de Vida: %d\nPoder Base: %.1f", 
                nome, classe, nivel, pontosDeVida, poderBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        // Igualdade baseada em nome e classe conforme solicitado
        return Objects.equals(nome, that.nome) && Objects.equals(classe, that.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}