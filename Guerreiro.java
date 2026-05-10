package eldoria;

// Guerreiro.java
public class Guerreiro extends Personagem {

    // O construtor repassa os valores para a superclasse (Personagem)
    // Definimos automaticamente a String "Guerreiro" para o atributo classe
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Implementação obrigatória do método abstrato da superclasse
    @Override
    public void usarHabilidade() {
        // Lógica específica para o Guerreiro conforme solicitado
        System.out.println("Habilidade: " + getNome() + " desfere um golpe devastador!");
    }
}
