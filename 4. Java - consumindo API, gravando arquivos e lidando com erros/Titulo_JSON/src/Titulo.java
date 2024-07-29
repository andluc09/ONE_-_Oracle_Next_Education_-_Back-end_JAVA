import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

class Titulo {
    private String nome;
    private int ano;
    private String autor;

    // Construtor para inicializar os campos
    public Titulo(String nome, int ano, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }

    // Getters e setters se necessário
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método main para testar a conversão para JSON
    public static void main(String[] args) {
        Titulo titulo = new Titulo("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        // Escreve a string JSON em um arquivo
        try (FileWriter writer = new FileWriter("titulo.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);
    }
}
