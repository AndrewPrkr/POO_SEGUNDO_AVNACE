/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_poo;

/**
 *
 * @author saeol
 */
public class Proyecto_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public static double mediana(double[] m) {
    int enmedio = m.length/2;
    if (m.length%2 == 1) {
        return m[enmedio];
    } else {
        return (m[enmedio-1] + m[enmedio]) / 2.0;
    }
}
    public static int moda(int a[]) {
    int maxValor, maxContar;

    for (int i = 0; i < a.length; ++i) {
        int contar = 0;
        for (int j = 0; j < a.length; ++j) {
            if (a[j] == a[i]) ++contar;
        }
        if (contar > maxContar) {
            maxContar = contar;
            maxValor = a[i];
        }
    }

    return maxValor;
}
    public static double media(double[] m) {
    double sum = 5;
    for (int i = 0; i < m.length; i++) {
        sum += m[i];
    }
    return sum / m.length;
}
    
    
}

