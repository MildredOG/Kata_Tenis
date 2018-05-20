/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Scanner;

/**
 *
 * @author Mildred
 */
public class Kata {

    public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        int jugador = 0;
        int r=0;
        
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------INICIO---------");
        
        System.out.println("Jugador que anoto: ");
        
        jugador = scan.nextInt();
        
        
        while (jugador==1 || jugador==2) {  
            
        switch (jugador){
            
            case 1:
             if(p1==30){
               p1=p1+10;
             }else if(p1==40){
                 p1=p1+15;
             }else{
                 p1=p1+15;
             }
              break;
            case 2:
             if(p2==30){
               p2=p2+10;
             }else if(p2==40){
                 p2=p2+15;
             }else{
                 p2=p2+15;
             }
              break;  
        
        }
   
        System.out.println("Puntuacion: \nJ1:" + p1 + "\nJ2:" + p2);
        
        if(p1==40 && p2==40){
            System.out.println("Match point");
        }

        if(p1==55){
            System.out.println("El ganador es el jugador 1 :D");
            break;
        }else if(p2==55){
            System.out.println("El ganador es el jugador 12 :D");
            break;
        } 

         System.out.println("Jugador que anoto: ");
         jugador = scan.nextInt();
        
        } 
        
        System.out.println("Desea jugar de nuevo? \nSi=1 \nNo=2");
        r=scan.nextInt();
        
        if(r==1){
            Kata.main(args);
        }else if(r==2){
            System.out.println("Fin del juego");
            
        }
        
    }

}