 
import java.util.Scanner;
public class Main {
     
    public static void  main(String args[]){
          Scanner clavier=new Scanner(System.in); 
          Service  service=new service();
          String choix;

        do{  
           
          System.out.println("1-Ajout classe ");
          System.out.println("2-lister classe");
          System.out.println("3-inscrire Etudiant");
          System.out.println("4-Lister Etudiant");
          System.out.println("5-Affecter Professeur");
          System.out.println("6-Lister professeur");
          System.out.println("7-Quitter");
          System.out.println("fait votre choix");
          choix=clavier.next();


            switch(choix){
                case "1":
                System.out.println("Entre le Libelle d'une classe");
                String libelle=clavier.nextLine();
                Classe cl=new Classe(libelle);
                /*
                cl.setLibelle(libelle);
                Service.ajouterClasse(cl);
                */
                break;
                case "2":
                System.out.println("-----------###########--------------------");
                Service.listerClasse();
                System.out.println("-----------###########--------------------");
                break ;
                case "3":
                System.out.println("inscrire Etudiant"); 
                break; 
                case "4":
                 System.out.println("-----------###########--------------------");
                Service.listerPersonne();
                System.out.println("-----------###########--------------------");
                
                break; 
            }  

        }while (choix!="7");
    }

         
        
}