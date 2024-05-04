package fundamentosjava;

public class OperadorDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        //limiteTentativasLogin--;
        //int novoLimiteTentativaLogin = limiteTentativasLogin --;
        int novoLimiteTentativaLogin = --limiteTentativasLogin ;

        System.out.println("Limites de tentativas de login: " + limiteTentativasLogin);
        System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativaLogin);
    }
}

