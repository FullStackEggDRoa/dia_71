/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import Entidades.Juego;
import Entidades.JugadorRuleta;
import Entidades.RevolverDeAgua;
import Servicios.serviciosJuego;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //serviciosJuego sJ = new serviciosJuego();
        Juego j1 = new Juego();
        RevolverDeAgua r1 = new RevolverDeAgua();
        
        ArrayList <JugadorRuleta> jugadores_aux = new ArrayList<>();
        
        int jugadores_cont=1;
        
        //do{
            
            System.out.println(".:: RULETA RUSA ::.");    
            System.out.print("Ingrese cantidad de Jugadores: ");
            jugadores_cont = leer.nextInt();
       
        //}while(!(jugadores_cont>2 && jugadores_cont<6));
        
        if(jugadores_cont<1 || jugadores_cont>6){
            jugadores_cont=6;
        }
        
        for(int i=0;i<jugadores_cont;i++){
            jugadores_aux.add(new JugadorRuleta(i+1,"Jugador "+(i+1),false));
        }
        
        r1.llenarRevolver();
        j1.llenarJuego(jugadores_aux, r1);
        
        System.out.println(".:: INICIO DEL JUEGO ::..");
        
        j1.ronda();
        
        System.out.println(j1.getJugadores().toString().replace(",", ""));
        
        
        
    }
    
}
