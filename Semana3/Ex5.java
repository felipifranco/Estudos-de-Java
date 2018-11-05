/**
 * Ex5
 */
public class Ex5 {

    static void tabuada(int n){
        //pq nao 0????
        int i =1;
        while (i <= 10) {
            System.out.println(n +"x"+ i + "=" + n*i);            
        i++;
        }
    }

    static void tabuada2(int n){
        int i = 1;
        while (i <= 10){
            System.out.println(n + " x " + i + " = \t" + n*i);
        i = i + 1;
        }
     }

    public static void main(String[] args) {
        tabuada(7);
        tabuada2(5);
    }
}