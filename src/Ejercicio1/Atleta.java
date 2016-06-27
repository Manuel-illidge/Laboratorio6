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

Ejercicio 1:
        En una competencia participan N atletas de los cuales es importante
conocer su nombre, nacionalidad y su tiempo. Desarrolle una aplicación
que presente el siguiente menú:

    COMPETENCIA
1. Registrar Atleta
2. Datos del campeón.
3. Atletas por país
4. Tiempo promedio de todos los atletas
5. Salir

* Registrar Atleta: Debe solicitar el nombre, la nacionalidad y el tiempo
del atleta
* Datos Campeón: Muestra el nombre, la nacionalidad y el tiempo del
atleta cuyo tiempo es el menor de todos.
* Atletas por país: Solicita el nombre del país y muestra los nombres de
todos los atletas de ese país.
* Tiempo promedio de todos los atletas: Muestra el tiempo promedio de
los atletas registrados.

    Características de la aplicación:
La aplicación debe desarrollarse de manera orientada a objetos,
incluyendo las clases Atleta, Competencia y Principal.

Debe emplear arreglos para su solución.
 */

package Ejercicio1;

public class Atleta {
    
    String nombre;
    String nacionalidad;
    double tiempo;

    public Atleta() {
        this.nombre = null;
        this.nacionalidad = null;
        this.tiempo = 0;
    }

    public Atleta(String nombre, String nacionalidad, double tiempo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", tiempo=" + tiempo + '}';
    }
    
}
