package eldoria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de personagens (Polimorfismo)
        ArrayList<Personagem> herois = new ArrayList<>();

        // Adicionando Magos e Guerreiros
        herois.add(new Mago("Eldoran", 7, 60, 18.0));
        herois.add(new Mago("Thalassa", 8, 55, 22.0));
        herois.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        herois.add(new Guerreiro("Korg", 6, 95, 15.0));

        // Percorrendo a lista
        for (Personagem p : herois) {
            System.out.println(p.toString()); // Chama o toString sobrescrito
            p.usarHabilidade(); // Chama a habilidade específica da classe real

            // Verificação com instanceof para mensagem personalizada
            if (p instanceof Mago) {
                System.out.println("O personagem " + p.getNome() + " é um Mago de nível " + p.getNivel() + ".");
            } else if (p instanceof Guerreiro) {
                System.out.println("O personagem " + p.getNome() + " é um Guerreiro de nível " + p.getNivel() + ".");
            }
            System.out.println("-----------------------------");
        }

        // Comparando dois personagens específicos com equals()
        Personagem p1 = herois.get(0); // Eldoran
        Personagem p2 = herois.get(2); // Arthemis

        System.out.print("Comparando, " + p1.getNome() + " e " + p2.getNome() + " são: ");
        if (p1.equals(p2)) {
            System.out.println("Iguais.");
        } else {
            System.out.println("Diferentes.");
        }
    }
}