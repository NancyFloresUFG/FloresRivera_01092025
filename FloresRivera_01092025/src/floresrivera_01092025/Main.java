/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_01092025;
import java.util.Scanner;
/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matriz();
    }
    public static void matriz(){
        // Se instancia el scanner para lectura de teclado
        Scanner sc = new Scanner (System.in);
        // Se instancia la matriz de tipo integer
        int [][] matriz = new int [3][3];
        int suma = 0; // Variable para sumar valores digitados
        int total_elementos = 0; // Contador de elementos de la matriz
        double promedio = 0d; // Cálculo del promedio de edades digitadas
        // Salida al usuario para indicar que debe ingresar datos
        System.out.println ("Ingrese los valores para una matriz 3 x 3: ");
        // Se recorre primero las filas con una estructura de control iterativa tipo for 
        for (int i = 0; i < matriz.length; i++){
            // En cada iteración se deberá obtener la cantidad de elementos que existen en el arreglo
            total_elementos += matriz[i].length;
            // Se recorre las columnas de la matriz con una estructura de control iterativa tipo for
            for(int j = 0; j<matriz[i].length; j++){
                //Se imprime la petición al usuario
                System.out.println("Elemento [" + i + "][" + j + "]");
                //Se hace lectura de teclado
                matriz[i][j] = sc.nextInt();
            } // Cierre del for para obtener columnas
        } // Cierre del for para obtener filas
        // Salida de valores para el usuario
        
        System.out.println("Matriz ingresada: ");
        // Se recorren las filas de la matriz
        for(int x =0; x < matriz.length; x++){
            // Se recorren las columnas de la matriz
            for(int y = 0; y< matriz[x].length; y++){
            // Se vuelve un array
            // Se imprime el valor de cada celda de la matriz (fila,columna)
            // Fila: x Columna: y
                System.out.print(matriz[x][y]+" ");
                // Se suman los valores digitados de cada celda
                suma += matriz[x][y];
            } 
            // Se imprime un salto de línea
            System.out.println();
        }
        // Cálculo de los valores
        promedio = (double) suma/total_elementos;
        // Se imprime la salida del programa al usuario con los valores calculados
        System.out.println(suma+" es la sumatoria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
        System.out.println("El promedio de edad es: " + promedio);
        // Se cierra el uso de la clase scanner
        sc.close();
    }
}