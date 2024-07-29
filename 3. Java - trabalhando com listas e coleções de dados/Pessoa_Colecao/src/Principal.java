import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("\nTamanho da lista: " + listaDePessoas.size());

        System.out.println("\nPrimeira Pessoa: " + listaDePessoas.get(0));

        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}