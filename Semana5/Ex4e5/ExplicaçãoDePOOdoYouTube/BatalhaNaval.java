/**
 * BatalhaNaval
 */
public class BatalhaNaval {
    private int[][] mar;

    public BatalhaNaval(int tamanho) {
        this.mar = new int[tamanho][tamanho];
        for( int i=0; i < tamanho ; i++){
            for(int j=0; j < tamanho ; j++){
                this.mar[i][j] = 0;
            }
        }
    }

    public void colocarNavio(int x, int y) {
        this.mar[x][y] = 1;
    }

    public void printBatalhaNaval(){
        for(int[] linha : this.mar){
            for(int valor : linha){
                System.out.print(valor + "  ");
            }
        System.out.println("");
        }
    System.out.println("");
    }

}