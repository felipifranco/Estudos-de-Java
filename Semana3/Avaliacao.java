// Em certa universidade, a aprovação dos alunos requer:
//
// a. Uma frequência maior ou igual a 70%.
//
// b. Uma nota igual ou maior a 5.0, que pode ser obtida:
//
        //  I. Na primeira avaliação (media1): equivale à média simples
        //  de três provas (P1, P2 e P3) aplicadas durante o semestre.
//
        //  II. Na segunda avaliação (media2): equivale à média simples
        //  entre a média da primeira avaliação (media1) e da prova de
        //  recuperação (PREC).
//
// c. Importante: apenas alunos com média entre 3.0 e 5.0 na primeira avaliação
// têm autorização para fazer a prova de recuperação. Portanto, a nota da PREC
// deve ser ignorada tanto para alunos com aprovação direta (i.e. na primeira
// avaliação) quanto para alunos que não atingirem a nota mínima de 3.0
// na primeira avaliação. Deseja-se implementar um programa que seja capaz
// de dizer se o aluno foi aprovado ou reprovado com base em suas notas e
// frequências. Para isso, foi desenvolvido o código (incompleto) a seguir.
// Responda às questões abaixo: 

public class Avaliacao {
  
    //Possíveis resultados
    final static int APROVADO_DIRETO = 0; //Aprovado na P1,P2,P3
    final static int APROVADO_2AVALIACAO = 1; //Aprovado após PREC
    final static int REPROVADO_FREQUENCIA = 2; //Reprovado por frequência
    final static int REPROVADO_DIRETO = 3; //Não autorizado a fazer REC
    final static int REPROVADO_2AVALIACAO = 4; //Reprovado após fazer REC
  
    static int avaliar (double P1, double P2, double P3, double PREC, int freq){
        double mediaProvas = (P1+P2+P3)/3;
        double mediaRec = (mediaProvas + PREC)/2;
        // Complete o método "avaliar", que dá o resultado da avaliação com base
        // nas notas e frequências passadas como parâmetro.
        // O resultado é um valor entre 0 e 4, definido pelas constantes no início da classe.
    
        //comentar pq antes
        if(freq < 70){
            return REPROVADO_FREQUENCIA;
        }
                           //comentar aqui
        if(mediaProvas >= 5 && freq >= 70){
            return APROVADO_DIRETO;
        }else {
            if(mediaProvas < 3){
                return REPROVADO_DIRETO;

                    //preciso disso?
            }else if(3 <= mediaProvas && mediaProvas < 5){
                if(mediaRec >= 5){
                    return APROVADO_2AVALIACAO;
                }else{
                    return REPROVADO_2AVALIACAO;
                }
            }
        }
        return(-1);
    }
  
    public static void main(String[] args) {
        int resultado = avaliar(3.0, 3.0, 3.0, 8.0, 70);
        //RESPOSTA DA PERGUNTA 4
        switch(resultado){
            case APROVADO_DIRETO:
               System.out.println("Aprovado direto.");
               break;
            case APROVADO_2AVALIACAO:
               System.out.println("Aprovado na 2a avaliacao.");
               break;
            case REPROVADO_FREQUENCIA:
               System.out.println("Reprovado por frequencia.");
               break;
            case REPROVADO_DIRETO:
               System.out.println("Reprovado sem direito a recuperacao.");
               break;
            case REPROVADO_2AVALIACAO:
               System.out.println("Reprovado apos a recuperacao.");
               break;
        }

    }//fim do main
 }// fim da classe