// Texto para as questões 4) e 5):

// Deseja-se implementar o jogo de Batalha Naval usando Java. Para isso, deve ser criada a
// classe "Tabuleiro", que tem a seguinte especificação:

//     Essa classe deve conter 1 atributo de objeto (não de classe), o mar: trata-se de uma
//     matriz quadrada cujo tamanho é passado como parâmetro no construtor da classe.

//         Os valores dessa matriz são inteiros:
                // 0 significa que não há navio naquela coordenada;
                // 1, que há um navio e que ele não foi abatido;
                // 2, que havia um navio, mas ele foi abatido.

//     Essa classe deve ter os seguintes métodos, além do construtor:
//         colocarNavio: recebe como parâmetros as coordenadas do navio a ser colocado no
//         tabuleiro, e atualiza o tabuleiro de acordo.

//         retirarNavio: recebe como parâmetros as coordenadas do navio a ser retirado no
//         tabuleiro, e atualiza o tabuleiro de acordo.

//         contarNavios: retorna o número total de posições no tabuleiro que ainda têm navios
//         não abatidos.

//         atirar: recebe como parâmetros as coordenadas de um tiro; se havia um navio
//         naquela posição, atualiza o tabuleiro de acordo e retorna true para indicar que o tiro
//         foi certeiro, caso contrário, retorna false para indicar que o tiro foi na água.

// Assinale a alternativa que descreve corretamente uma possível implementação dessa classe,
// considerando as duas partes do código.

public class Tabuleiro {
    // https://pt.wikibooks.org/wiki/Java/Modificadores
    // http://high5devs.com/2015/02/modificadores-de-acesso-em-java/

    // Modificador	             |  Classe  |   Pacote  | Subclasse	| Globalmente
    // --------------------------+----------+-----------+-----------+------------
    // Public	                 |   sim	|    sim	|    sim	|    sim
    // Protected	             |   sim	|    sim	|    sim	|    não
    // Sem Modificador (Padrão)	 |   sim	|    sim	|    não	|    não
    // Private	                 |   sim	|    não	|    não	|    não

    // atributo de objeto Tabuleiro
    private int[][] mar;

    public Tabuleiro(int tamanho) {
        // criando a matriz objeto de Tabuleiro
        // mar é o atributo da classe
        // this, é a representação do objeto q está chamando o método (auto referência)
        // em outras palavras, this é qm chamou o método
        this.mar = new int[tamanho][tamanho];

        // após criada a matriz, inicializando ela com os valores iguais a "0"
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.mar[i][j] = 0;
            }
        }
    }

    public void colocarNavio(int x, int y) {
        // mar é o atributo da classe
        // this, é a representação do objeto q está chamando o método (auto referência)
        // em outras palavras, this é qm chamou o método colocarNavio (nos exemplos é t1 ou t2)
        // então this referencia o atributo mar de t1 ou t2, dependendo do objeto q chamou o método.
        this.mar[x][y] = 1;
    }

    public void retirarNavio(int x, int y) {
        this.mar[x][y] = 0;
    }

    public int contarNavios() {
    int contador = 0;
    //for (int[] linha : mar) {
    for (int[] linha : this.mar) {
        for (int valor : linha) {
            if (valor == 1) { contador++; }
        }
    }
    return contador;
    }

    public boolean atirar(int x, int y) {
    if (this.mar[x][y] == 1) {
        this.mar[x][y] = 2;
        return true;
    }
    return false;
    }

    public void printTabuleiro(){
        for (int[] linha : this.mar) {
            for (int valor : linha) {
                System.out.print(valor + "  ");
            }
        System.out.println("");
        }
    System.out.println("");
    }

    // Caso o programa não funcione, adicione o método main a classe Tabuleiro como na linha abaixo (sem os comentarios é claro...)
    // public static void main(String[] args) {}

}