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

Para conseguir el objetivo, se le suministra la clase principal y la clase de
prueba, tenga en cuenta los nombres de los métodos, argumentos y tipos
de datos para la codificación.
Cree y Compile la siguiente clase:
---------------------------------------------------------
                       MiColeccion
---------------------------------------------------------
 */
package Ejercicio2;

import java.util.*;

public class MiColeccion {

    private ArrayList numeros= new ArrayList();

    public MiColeccion() {
    }
    public void insertarAlFinal (int valor){
        this.numeros.add(valor);
    }
    public void insertarAlPrincipio (int valor){
        this.numeros.add(0, valor);
    }
    public void agregarAlFinal (List l){
        this.numeros.addAll(l);
    }
    public void eliminar (int posicion){
         this.numeros.remove(posicion);
    }
    public void setValor (int posicion, int valor){
        this.numeros.add(posicion, valor);
    }
    public int getValor (int posición){
         return (int) (this.numeros.get(posición));
    }
    public int getSumatoria (){
         int suma = 0;
         for (Object num : this.numeros) {
            suma = suma + (int) num;
         }
         return suma;
    }
    public double getPromedio (){
        return getSumatoria ()/(double)this.numeros.size();
    }
    public int cuentaElementos (){
        return this.numeros.size();
    }
    public int cuentaCeros(){
        int cantidad = 0;
        for (Object num : this.numeros) {
            if ((int) num == 0) {
                cantidad = cantidad + 1;
            }
        }
        return cantidad;
    }
    public int sumaPares (){
        int par = 0;
        for (Object num : this.numeros) {
            if (((int) num % 2) == 0) {
                par = par + (int) num;
            }
        }
        return par;
    }
    public int cuentaRepeticiones (int numero){
        int cuenta = 0;
        for (Object num : this.numeros) {
            if ((int) num == numero) {
                cuenta = cuenta + 1;
            }
        }
        return cuenta;
    }
    public void reemplazarValor (int antiguoValor, int nuevoValor){
        for (int i=0; i<this.numeros.size();i++) {
            if (this.numeros.get(i).equals(antiguoValor)) {
                this.numeros.set(i, nuevoValor);
            }
        }
    }
    public void reemplazarTodo (List a){
        this.numeros.clear();
        this.numeros.addAll(a);
    }
    public ArrayList invertir ( ){
        ArrayList num=new ArrayList();
        for(int i=(this.numeros.size()-1);i>=0;i--){
            num.add(this.numeros.get(i));
        }
        return num;
    }
    public int getMayor ( ){
        int mayor = (int) this.numeros.get(0);
        for (Object numero : this.numeros) {
            if ((int)numero > mayor) {
                mayor=(int) numero;
            }
        }
        return mayor;
    }
    public int getMenor ( ){
        int menor = (int) this.numeros.get(0);
        for (Object numero : this.numeros) {
            if ((int)numero < menor) {
                menor=(int) numero;
            }
        }
        return menor;
    }
    public ArrayList getPrimeros (int cantidad){
        ArrayList primeros = new ArrayList();
        for(int i=0;i<cantidad;i++){
            primeros.add(this.numeros.get(i));
        }
        return primeros;
    }
    public ArrayList getUltimos (int cantidad){
        ArrayList ultimos = new ArrayList();
        for(int i=(this.numeros.size()-cantidad);i<this.numeros.size();i++){
            ultimos.add(this.numeros.get(i));
        }
        return ultimos;
    }
    public boolean esPalindrome (){
        if(this.numeros.equals(invertir())){
            return true;
        }else{
            return false;
        }
    }
    public boolean buscar (int numero){
         return this.numeros.contains(numero);
    }
    public void mostrarContenido (){
        System.out.println(this.numeros);
    }
    
}
