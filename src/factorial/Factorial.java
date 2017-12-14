package factorial;

public class Factorial {

    /**
     * Ejercicio 2 de Entornos de Desarrollo.
     *
     * @author quique
     * 
     * @param args Argumentos del bueno de Quique.
     */
    public static void main(String[] args) {

        CalcularFactorial cff = new CalcularFactorial();
        cff.calculoFact(cff.numero, cff.factorial);
        System.out.println(cff.factorial);

    }

}
