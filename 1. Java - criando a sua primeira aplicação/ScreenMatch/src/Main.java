public class Main { // Exemplo MainMenu - Padrão Pascal Case
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("\nFilme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // Padrão Camel Case

        // Convenções de Código : variável, inicia-se com letra minúscula
        //                        Classe, inicia-se com letra maiúscula

        System.out.println(" Ano de lançamento: " + anoDeLancamento); // Concatenação

        boolean incluidoNoPlano = true;

        System.out.println(" Incluído no Plano: " + incluidoNoPlano);

        double notaDoFilme = 8.1; // Tipo: Ponto Flutuante

        System.out.println(" Nota do Filme: " + notaDoFilme);

        /*int a = 10 + 5; // Atribui o valor 15 à variável a
          int b = 10 - 5; // Atribui o valor 5 à variável b
          int c = 10 * 5; // Atribui o valor 50 à variável c
          int d = 10 / 5; // Atribui o valor 2 à variável d
          int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)*/

        /*int a = 10; // Atribui o valor 10 à variável a
          int b = 5;   // Atribui o valor 5 à variável b
          int c = 30;  // Atribui o valor 30 à variável c

          boolean igual = (b == a);      //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
          boolean diferente = (b != c);  //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
          boolean maior = (b > a);       //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
          boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.*/

        /*boolean a = true;
          boolean b = false;
          if (a && b) {
             // Este código não será executado, já que a é verdadeiro e b é falso.
          }*/

        /*boolean a = true;
          boolean b = false;
          if (a || b) {
             // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
          }*/

        /*boolean a = true;
          if (!a) {
             // Este código não será executado, já que a é verdadeiro.
          }*/

        // O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão:
        /*int num = 5;
          int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
          System.out.println(num); // imprime 6
          System.out.println(resultado); // imprime 6*/

        // O operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão:
        /*int num = 5;
          int resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
          System.out.println(num); // imprime 6
          System.out.println(resultado); // imprime 5*/

        double mediDasAvaliacoes = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(" Media das Avaliações: " + mediDasAvaliacoes);

        String resumo;
        resumo = "Filme de aventura com galã dos anos 80";
        System.out.println("\n Resumo: " + resumo);

        String sinopse;
        sinopse = """ 
                                
                Filme Top Gun
                Filme de aventura com o ator Tom Cruise, continuação do primeiro título Top Gun - Ases Indomáveis de 1986
                Lançamento em: 
                """ + anoDeLancamento; // Recurso, a partir do Java 15: Text Blocks """ ... """
        System.out.println("\nSinopse: " + sinopse);

        // Para realizar maiores formataçõe em strings ou texto, existe: o Método Formatted

        //Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto
        // na memória, e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:
        /*String senha = "12345";
            if (senha.equals("12345")) {
                System.out.println("Acesso autorizado!");
            } else {
                System.out.println("Senha incorreta.");
            }
        */

        //Mais adiante trabalharemos também com o método equalsIgnoreCase(), que é usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas.
        // Utilizando apenas o equals, as String “aviao” e “Aviao” seriam consideradas diferentes.

        //Método Formatted
        //Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String.
        // Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo
        // de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica
        // um valor de ponto flutuante. Vamos ver um exemplo:

        /*String nome = "André";
          int idade = 28;
          double valor = 55.9999;
          System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        */

        /*String nome = "André";
          int aulas = 4;

           String mensagem = """
                             Olá, %s!
                             Boas vindas ao curso de Java.
                             Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                             """.formatted(nome, aulas);

           System.out.println(mensagem);
        */

        // Conversão de tipos de dados ou CASTING, exemplo abaixo:

        int classificacao = (int) (mediDasAvaliacoes / 2);

        System.out.println("\n   Classificação: %d estrelas".formatted(classificacao));

        // Casting Implícito

        /*int x = 10;
          double y = x; // casting implícito
        */

        // Casting Explícito

        /*double x = 10.5;
          int y = (int) x; // casting explícito
        */


    }
}