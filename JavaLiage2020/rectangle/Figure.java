

public abstract class Figure{

         //Attributs Instances
            protected  double longueur;

        //Attributs Classes ou Static
            protected  static String unite;

        //Methodes Instances Concretes 
            //Constructeur
               public Figure(){

        }
           //Getters
              public double getLongueur(){
                  return this.longueur;
       }

          //Setters
              public String setLongueur(double longueur){
                 this.longueur=longueur;
      }
   
     //Methodes Static Concretes 
      
          //Getters
              public static String getUnite(){
                 return Figure.unite;
             }

         //Setters
            public static void setUnite(String unite){
                Figure.unite = unite;
        }

    //Methode Matier abstraites  (Static ou instances)
        //Methode Matier abstraites instance
           public abstract double demiperimetre();
           public abstract double surface();
           public abstract double diagonal();

    //Methode Matier concrete(Static ou instances) 
       //Methode Matier concrete instance 
           public  double perimetre(){
             return this.demiperimetre()*2; 
            }

}