public class DesafioTemperatura {

    public static void main(String[] args) {

        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("\nA temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("\nA temperatura em Fahrenheit inteira é: %d Fahrenheit".formatted(temperaturaEmFahrenheitInteira));
    }

}