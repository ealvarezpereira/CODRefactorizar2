/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 * Ejercicio 2 de Entornos de Desarrollo.
 *
 * @author quique
 */
public class CalcularFactorial {

    int numero;
    int factorial;

    /**
     * Metodo que hace el calculo de factoriales.
     *
     * @param numero Es el numero del cual vamos a calcular el factorial.
     *
     * @param factorial Es la factorial de ese numero.
     */
    public void calculoFact(int numero, int factorial) {
        numero = 8;

        int cont;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (cont = numero; cont >= 1; cont--) {
                factorial = factorial * cont;
            }
        }

    }
}
