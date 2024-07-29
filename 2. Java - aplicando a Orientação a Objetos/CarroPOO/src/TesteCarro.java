public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro(); // Herança, a classe ModeloCarro herda da classe Carro seus atributos e métodos
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}