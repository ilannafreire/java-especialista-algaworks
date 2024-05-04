package fundamentosjava;

public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;

        //totalDownloads = totalDownloads + 1;
        //totalDownloads += 1;

        //totalDownloads++;

        //int novoTotalDownloads = totalDownloads++;
        int novoTotalDownloads = ++totalDownloads;


        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total de downloads:" + novoTotalDownloads);


    }
}

/* l6 e l7 formas de add mais 1 downloads feito.
* l10 - usando da forma de incremento para add downloads
* ele add apenas uma unidade.
*  operador de incremento pós fixada - ++ depois da varável
* incrementa primeiro pra depois atribuir - pré fixada ++ antes da varável
*
 */