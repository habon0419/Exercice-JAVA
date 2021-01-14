public class Etudiant extends Personne{

   
       //Attributs Instances

              private tuteur; 
 
       //proprietes Etudiants 

       //proprietes Navigationnelles=>
       //Association ManyToOne entre Etudiant et classe

         private Classe classeEtu;

          //Constructeur par defaut
          //super=> represent la classe parente
          //super=>personne 
               public Etudiant(){ 
                   
                   super()://personne();
               } 
               //surcharge 
               public Etudiant(String nom,String prenom, String tuteur,classe,classeEtu){
                 super(nom.prenom);//personne(nom,prenom)
                  this.tuteur=tuteur;
                  this.classeEtu= classeEtu;
      
               }
               

       //Methodes Instances Concretes 
           

           //Getters
              public String getTuteur(){
                  return tuteur;
       }

         public  Classe getClasseEtu(){
                  return  classeEtu;
       }

           //Setters
              public void setTuteur(String tuteur){
                 this.tuteur=tuteur;
      }

         public void setClasseEtu( Classe  classeEtu){
                 this.classeEtu= classeEtu;
      }

        @Override
           publi String affiche{
              return super.affiche() +"Tuteur: "+tuteur+" Classe: "+classeEtu.getLibelle();

           } 
 
      

} 

      