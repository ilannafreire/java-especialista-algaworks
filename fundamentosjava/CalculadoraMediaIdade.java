package fundamentosjava;

public class CalculadoraMediaIdade {
    public static void main(String[] args) {
       int minhaIdade = 40;
       int suaIdade = 20;
       int idadePedro = 50;

       int idadeMedia = (minhaIdade + suaIdade + idadePedro) / 3;

       System.out.println("Idade média: " + idadeMedia);
    }
}

/* Na linha 9, é preciso agrupar as idades com parenteses para depois
* dividi-las. Caso não coloque os (), apenas a idade de Pedro será
* dividida por 3. Atente-se sempre aos grupos.
 */