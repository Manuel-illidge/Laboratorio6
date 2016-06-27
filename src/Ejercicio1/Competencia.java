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

import javax.swing.JOptionPane;

/**
 *
 * @author Aldo Navarro
 */
public class Competencia {
    
    private Atleta[] at;
    int op = 0,tamaño=0;
    

    public void MostrarMenu() {
        
        boolean ban = true;
        
        do{
            if(op==0){
                do{
                    op = Integer.parseInt(JOptionPane.showInputDialog("    Competencia - Menu\n1. Registrar Atletas\n2. Datos del Campeon\n3. Atletas por Pais\n4. Tiempo Promedio de Todos los Atletas\n5. Salir"));
                    
                    if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5){
                        
                        JOptionPane.showMessageDialog(null,"Por favor digitar un numero entero del 1 al 5");
                    
                    }else if (op!=1 && op!=5){
                        JOptionPane.showMessageDialog(null,"No hay atletas registrados");
                    }
                }while(op!=1 && op!=5);
            }else{
                do{
                    op = Integer.parseInt(JOptionPane.showInputDialog("    Competencia - Menu\n1. Registrar Atletas\n2. Datos del Campeon\n3. Atletas por Pais\n4. Tiempo Promedio de Todos los Atletas\n5. Salir"));
                    
                    if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5){
                        
                        JOptionPane.showMessageDialog(null,"Por favor digitar un numero entero del 1 al 5");
                    
                    }
                }while(op!=1 && op!=2 && op!=3 && op!=4 && op!=5);
            }

            if(op==1){
                RegistrarAtleta();
                ban = true;
            }else if(op==2){
                DatosCampeon();
                ban = true;
            }else if(op==3){
                AtletasPais();
                ban = true;
            }else if(op==4){
                TiempoPromedioAtletas();
                ban = true;
            }else if(op==5){
                ban = false;
            }
        }while(ban);
    }
    
    private void RegistrarAtleta() {
        String nom, nac;
        double tie;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de atletas a registrar"));
        at = new Atleta[tamaño];
        
        for(int i=0;i<tamaño;i++){
            
            nom=(JOptionPane.showInputDialog("Digite el Nombre del Atleta"));
            nac=(JOptionPane.showInputDialog("Digite la Nacionalidad del Atleta"));
            tie=(Double.parseDouble(JOptionPane.showInputDialog("Digite el Tiempo en Minutos del Atleta")));
            Atleta atleta = new Atleta(nom, nac, tie);
            at[i]=atleta;
        }
        
    }

    private void DatosCampeon() {
        
       int posCampeon = 0;
       double tiempoMenor = this.at[0].getTiempo();
       
       for(int i=1; i < tamaño; i++){
           if(this.at[i].getTiempo() < tiempoMenor){
               tiempoMenor = this.at[i].getTiempo();
               posCampeon = i;
           }
       }
       
       JOptionPane.showMessageDialog(null,"Datos del Campeon:\n     Nombre: "+this.at[posCampeon].getNombre()+".\n     Nacionalidad: "+this.at[posCampeon].getNacionalidad()+".\n     Tiempo: "+this.at[posCampeon].getTiempo()+" min.");
       
    }

    private void AtletasPais() {
        
        int num = 1;
        String nac, listaAtletas="";
        
        nac = JOptionPane.showInputDialog("Digite la Nacionalidad de los Atletas a Mostrar");
        
        for(int i=0;i<tamaño;i++){
            
            if(this.at[i].getNacionalidad().equals(nac)){
                
                listaAtletas = listaAtletas +("    "+(num) + ". "+this.at[i].getNombre()+".\n");
                num++;
            }
            
        }
        
        if(num==1){
            
            JOptionPane.showMessageDialog(null,"No hay atletas de " + nac );
            
        }else if(num==2){
            
            JOptionPane.showMessageDialog(null, "Hay 1 Atleta de " + nac + ":\n" + listaAtletas);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Hay " + (num-1) + " Atletas de " + nac + ":\n" + listaAtletas);
            
        }
        
    }

    private void TiempoPromedioAtletas() {
        
        double sumaTiempo = 0;
        
        for(int i=0;i<tamaño;i++){
            
            sumaTiempo = sumaTiempo + this.at[i].getTiempo();
            
        }
        
        JOptionPane.showMessageDialog(null, "El tiempo promedio de todos los atletas es: "+(sumaTiempo/tamaño));
        
    }

   
}