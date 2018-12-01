// Deseja-se implementar um jogo de baralho, com todas as cartas incluindo coringa. Para isso, os objetos da classe Carta devem ter a seguinte especificação:

// Atributos valor, do tipo inteiro: 1 (Ás), 2, ..., 10, 11 (J: valete), 12 (Q: dama) e 13 (K: rei)
// Atributo naipe, do tipo String: “ouros”, “espadas”, “copas” ou “paus”
// Para isso, é implementada a classe abaixo.

public class Carta {
    //Atributos estáticos (da classe)
    public static final String OUROS   = "ouros";
    public static final String ESPADAS = "espadas";
    public static final String COPAS   = "copas";
    public static final String PAUS    = "paus";

    //Atributos do objeto
    int valor;
    String naipe;

    //Construtor
    public Carta(int valor, String naipe){
       this.valor = valor;
       this.naipe = naipe;
    }

    //Método: compara com a carta “c” passada como parâmetro
    public boolean compara(Carta c){
       //Código da Pergunta 1
    }

    //Método da classe: imprime cartas em formato abreviado.
    public static void imprimeCurto(Carta[] cartas)
       //Código da Pergunta 2
    }

    //Método: busca carta no arranjo. Retorna o índice da carta se encontrada, ou -1 caso contrário.
    public int busca(Carta[] cartas)
       //Código das Perguntas 3 e 4
    }
    
    //Método: ordena carta no arranjo.
    public static void ordena(Carta[] cartas)
       //Código da Pergunta 5
    }
 }