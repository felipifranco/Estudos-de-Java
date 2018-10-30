/**
 * OrdemDePrecedencia
 * Este programa não faz nada....
 */
public class OrdemDePrecedencia {

    public static void main(String[] args) {
        double a, b, c, d, e, f, g;

        a = b * c % d + e / f - g;
        // (*) -> (%) -> (/) -> (+) -> (-) -> (=)

        a = b + c + d + e + f / g
        // b + c + d + e + (f / g)

        a = (b + c + d + e + f)/ g
        // (b + c + d + e + f)
        //---------------------
        //         g
    }
}