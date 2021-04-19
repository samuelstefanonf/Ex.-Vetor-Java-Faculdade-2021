import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

 
    System.out.println(" Favor informar quantas linhas os vetores terão");
    int linha = entrada.nextInt();
    System.out.println("Favor informar colunas os vetores terão");
    int coluna = entrada.nextInt();


    int vetorA[][] = new int [linha][coluna];
    int vetorB[][] = new int [linha][coluna];

    System.out.println("\nDados da vetor A");
    for (int i = 0; i < linha; i++){
        for (int j = 0; j < coluna; j++){
            System.out.println(" linha " + (i+1) + ":");
            vetorA[i][j] = entrada.nextInt();
            System.out.println("");
        }
    }


    System.out.println("\nDados da vetor B");
    for (int i = 0; i < linha; i++){
        for (int j = 0; j < coluna; j++){
            System.out.println("Digite os elementos da linha " + (i+1) + ":");
            vetorB[i][j] = entrada.nextInt();
            System.out.println("");
        }
    }


    int vetorC[][] = new int [linha][coluna];


    for(int i = 0; i < linha; i++){
        for(int j = 0; j < coluna; j++){
            int total = 0;
            for(int k = 0; k < linha; k++){
                int m = vetorA[i][k];
                int n = vetorB[k][j];
                total = total + m * n;
            }
            vetorC[i][j] = total;
            }
        }

    System.out.println("A x B =");
    for(int linhas[] : vetorC) {
        for (int posicao : linhas) {
            System.out.print(posicao+" ");
        }
        System.out.println();
    }
  }
}
