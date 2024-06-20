/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg1;

import javax.swing.JoptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui lo que hago es declarar las variables
        int cantidad_salarios;
        double salarios_individuales = 0;
        double total = 0;
        double total_deben;
        int i;
        cantidad_salarios=Integer.parseInt(JoptionPane.showInputDialog(null,"Ingrese la cantidad de salarios que desea ingresar: "));
        //Aqui realizo un ciclo para que se repita la cantidad de veces que el usuario haya indicado
        for(i = 0; i < cantidad_salarios; i++)
    {
        salarios_individuales= Integer.parseInt(JoptionPane.showInputDialog(null,"Ingrese los salarios de los empleados correspondientes: "
        total= total + salarios_individuales;
    }
        //Aqui hago las operaciones para sacar los montos de SEM y de IVM
        total_deben= (total*0.0925) + (total*0.0508);
        
        JoptionPane.showMessageDialog(null, "El total que se debe pagar es de: "+ total_deben);
    }
    