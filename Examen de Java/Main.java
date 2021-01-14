
//Importation d'une Classe
import java.util.Scanner;
public class Main {
     
         public static void  main(String args[]){
          Scanner clavier=new Scanner("sytem.in"); 
          int choix;

     do{  
           
         System.out.println("1-Ajout Service ");
          System.out.println("2-Lister les Services");
          System.out.println("3-Ajout Service  ");
          System.out.println("4-Lister les Employés d'un  Service   ");
          System.out.println("5-Afficher les Employés qui doivent partir en retraite cette année ");
          System.out.println("6-Quitter");
          choix=clavier.nextInt(); 

         switch(choix){
             case 1:
               sytem.out.println("Ajout Service");
               break
             case 2:
                sytem.out.println("Lister les Services"); 
               break 
             case 3:
                 sytem.out.println("Ajout Service") 
                break 
             case 4:
                 sytem.out.println("Lister les Employés d'un  Service ") 
                break 

        }while (choix!=7);

            }   
        
                     
}