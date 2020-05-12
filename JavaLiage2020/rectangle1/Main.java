   

//Importation d'une Classe
import java.util.Scanner;
public class Main {
     
         public static void  main(String args[]){

           //Output=>Affichage ou Ecrire des informations
                 //Ecran=> System.out
                    //Methodes
                       // print()
                       //println() 
                       // System.out.print("Bonjour \n");
                        // System.out.println("Bonjour ");
                        // System.out.println("à Tous");
                 //Fichier
                 //BD
            
           //Input=>saisir ou lire des informations
               //Clavier => System.in
                 //  Scanner clavier=new Scanner(System.in);
                    //System.out.println("Veuillez entrer un nom");
                   // String nom=clavier.next();
                     // String nom=clavier.nextLine();
               //+ :Contateination => addition des Chaines
                   // System.out.print("Le nom est "+nom);
               //Fichier
               //BD

                
                          Scanner clavier=new Scanner(System.in); 

                           System.out.println("Entrer la longueur");
                            double longueur=clavier.nextDouble();
                            Carre carre=new Carre(longueur);

                       if(choix >=1 && choix<=5){
                            if(choix==1){
                             System.out.println("Entrer la longueur");
                             double longueur=clavier.nextDouble();
                             Carre carre=new Carre(longueur);
                          } 
                         if(choix==2){
                            System.out.println("La longueur est " + carre.getLongueur());
                             System.out.println("Le Demi perimetre est " + carre.demiPerimetre());
 			    System.out.println("Le Perimetre est " + carre.perimetre());
                             System.out.println("La Surface est " + carre.surface());
                            System.out.println("La Diagonale est " + carre.diagonale());
                         }
   
                        }else{
                           //choix <1 || choix>5
                        }*/
               Carre carre=null;
               int choix;
    do{
                    Scanner clavier=new Scanner(System.in); 
                        System.out.println("1-Ajout d'un Carre");
                        System.out.println("2-Afficher les Carres");
                        System.out.println("3-Ajout d'un Rectangle");
                        System.out.println("4-Afficher les Rectangles");
                        System.out.println("5-Quitter");
                        System.out.println("Faites votre choix");
                       choix =clavier.nextInt();
                switch(choix){
                case 1:
                           System.out.println("Entrer la longueur");
                             double longueur=clavier.nextDouble();
                            carre=new Carre(longueur);
                  break;
                  case 2:
                          if(carre!=null){
                            System.out.println("La longueur est " + carre.getLongueur());
                             System.out.println("Le Demi perimetre est " + carre.demiPerimetre());
 			     System.out.println("Le Perimetre est " + carre.perimetre());
                             System.out.println("La Surface est " + carre.surface());
                            System.out.println("La Diagonale est " + carre.diagonale()); 
                           }else{
                             System.out.println("Veuillez la longueur du carre");
                           }
                         break;
                  case 3:
    
                   break;
                  case 4:
    
                   break;

                   case 5:
                   break;
                  default:
                    System.out.println("Choix invalide");

               }

}while(choix!=5);


liste = new int[27];
liste[0]=1; liste[1]=12; liste[3]=23; liste[4]=25; liste[5]=27;
for( int i = 0; i< liste.length; ++i){
   System.out.println(liste[i])




           
          }
}