package fundamentosjava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int minhaIdade = 45;
        int suaIdade = 22;

        // Adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das idades: " + totalIdades);

        // Subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades " + diferencaIdades);

        // Multiplicação
        int dobroIdade = 2 * suaIdade;
        System.out.println("Dobro da sua idade: " + dobroIdade);

        // Divisão
        int metadeDaIdade = suaIdade / 2;
        System.out.println("Metade da sua idade: " + dobroIdade);

        int restoDivisao = suaIdade % 2;
        System.out.println("Resto da divisão(módulo): " + metadeDaIdade);

    }
}
