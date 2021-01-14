

public abstract class Personne{

         //Attributs Instances
            protected  fullname;

        //Attributs Classes ou Static
            protected  static String affiche;

        //Methodes Instances Concretes 
            //Constructeur
               public Personne(){

        }
           //Getters
              public  getFullName(){
                  return this.fullname;
       }

          //Setters
              public String setFullName(fullname){
                 this.fullname=fullname;
      }

        //Methodes Static Concretes 
      
         //Getters
              public static String getAffiche(){
                 return Personne.affiche;
             }

         //Setters
            public static void setAffiche(String affiche){
                Personne.affiche = affiche;
        }


  }
   