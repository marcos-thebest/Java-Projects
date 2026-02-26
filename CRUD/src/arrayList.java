import java.util.ArrayList;

public class arrayList {
    public static void main(String [] args) {

        // Criando (instanciar) um objeto de ArrayList
        ArrayList<String> carros = new ArrayList<String>();

        // Imprimindo a lista "vazia"
        System.out.println("\nCriando uma lista vazia...\n" + carros);

        // Adicionando elementos no ArrayList - metodo add()
        carros.add("BMW");
        carros.add("Ferrari");
        carros.add("Audi");
        carros.add("Celta");
        carros.add("Corsa");
        carros.add("Uno");

        // Imprimindo todos os elementos da lista
        System.out.println("\nImprimindo todos os elementos da lista depois de ter usado o método add()...\n" + carros);

        System.out.println("\n===========================================================================");

        // Acessar um elemento específico no ArrayList - Metodo get()
        System.out.println("\nAcessando um elemento específico no ArrayList...\nCarro: " + carros.get(0));

        System.out.println("\n===========================================================================");

        // Alterando o conteúdo de uma posição específica
        carros.set(1, "Corcel");

        System.out.println("\nAlterando o conteúdo de uma posição específica...\n" + carros);

        System.out.println("\n===========================================================================");

        // Obter o tamanho de uma lista (ArrayList) - metodo size()
        System.out.println("\nTamanho da lista: " + carros.size() + " elementos dentro da lista.");

        System.out.println("\n===========================================================================");

        // Removendo um elemento da Lista
        carros.remove(0);
        carros.remove(1);

        System.out.println("\nEliminando o primeiro e o segundo elemento da lista com remove()...\n" + carros);

        System.out.println("\nTamanho da lista depois de remover dois elementos...\n" + carros.size() + " elementos dentro da lista.");

        System.out.println("\n===========================================================================");

        // Percorrendo a lista com for tradicional
        System.out.println("\nPercorrendo a lista com for tradicional...");

        for (int i = 0; i < carros.size(); i++) {
            System.out.printf("\n%d - %s%n", i + 1, carros.get(i));
        }

        System.out.println("\n===========================================================================");

        // ArrayList - Integer (int)
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        // Imprimindo a lista de numeros inteiros
        System.out.println("\nImprimindo uma lista de números inteiros...\n" + numeros);

        // Iterando a lista de numeros
        System.out.println("\nIterando a lista de inteiros...");

        for (Integer n : numeros) {
            System.out.println("Números: " + n);
        }
    }
}