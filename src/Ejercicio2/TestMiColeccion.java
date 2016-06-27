/*
 * SENA
 * Analisis y Desarrollo de Sistemas de Información
 * Autor GAES 2:
    * Aldo Javier Navarro Perez
    * Manuel Alfonso Illidge Ramirez
    * Roberto Jose Serrano Perez
    * William Alexander Tejada Embuz

    LABORATORIO 6 - Elementos del lenguaje de programación
y estructuras de datos en java

Ejercicio 2:
        Desarrolle una aplicación utilizando colecciones, la cual permita tener
las siguientes funcionalidades:
• Insertar elementos (al inicio, al final).
• Eliminar elementos.
• Obtener el valor de una posición determinada.
• Asignar valor a una posición determinada.
• Calcular la sumatoria de los valores de todos los elementos.
• Calcular el promedio de los valores de todos los elementos.
• Obtener el número de elementos.
• Contar el número de valores igual a cero (0).
• Calcular la suma de los pares.
• Contar el número de repeticiones dado un número.
• Modificar el valor de una posición por otro valor suministrado.
• Cambiar todo el contenido.
• Invertir el arreglo.
• Obtener el mayor valor.
• Obtener el menor valor.
• Obtener los primeros n elementos del arreglo.
• Obtener los últimos n elementos del arreglo.
• Indicar si es palíndromo.
• Indicar si un número se encuentra dentro del arreglo.
• Mostrar el contenido del arreglo.
*/
package Ejercicio2;

import java.util.*;
public class TestMiColeccion{
    public static void main(String arg[]){
        System.out.println("Mi Coleccion 1");
        MiColeccion mc1=new MiColeccion();
        mc1.insertarAlFinal(1);
        mc1.insertarAlFinal(2);
        mc1.insertarAlFinal(3);
        mc1.insertarAlPrincipio(4);
        mc1.mostrarContenido();
        ArrayList al=new ArrayList();
        al.add(9);
        al.add(10);
        al.add(11);
        mc1.agregarAlFinal(al);
        mc1.mostrarContenido();
        mc1.eliminar(0);
        mc1.eliminar(5);
        mc1.mostrarContenido();
        mc1.setValor(0,0);
        mc1.setValor(6,0);
        mc1.mostrarContenido();
        System.out.println("En la posicion 4 esta el "+mc1.getValor(4));
        System.out.println("La sumatoria de sus elementos es:"+mc1.getSumatoria());
        System.out.println("El promedio de sus elementos es:"+mc1.getPromedio());
        System.out.println("En la coleccion hay "+mc1.cuentaElementos()+"elementos");
        System.out.println("Y hay "+mc1.cuentaCeros()+ " ceros");
        System.out.println("La sumatoria de los pares es: "+mc1.sumaPares());
        System.out.println("El numero 2 esta "+mc1.cuentaRepeticiones(2)+ " veces");
        mc1.reemplazarValor(0,9);
        mc1.mostrarContenido();
        mc1.reemplazarTodo(al);
        mc1.mostrarContenido();
        System.out.println(mc1.invertir());
        System.out.println("El mayor elemento es: "+mc1.getMayor());
        System.out.println("El menor elemento es: "+mc1.getMenor());
        mc1.insertarAlFinal(1);
        mc1.insertarAlFinal(2);
        mc1.insertarAlFinal(3);
        mc1.mostrarContenido();
        System.out.println(mc1.getPrimeros(2));
        System.out.println(mc1.getUltimos(2));
        mc1.mostrarContenido();
        System.out.println("Palindrome="+mc1.esPalindrome());
        System.out.println("Esta el 3 en la lista? "+mc1.buscar(3));
    }
}