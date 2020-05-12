

public class Rectangle extends Figure{

         private $largeur; 


 //Getters
              public double getLongueur(){
                  return this.longueur;
       }

          //Setters
              public String setLongueur(double longueur){
                 this.longueur=longueur;
      }


 //Methode Matier abstraites  (Static ou instances)
        //Methode Matier abstraites instance
           public  double demiperimetre(){
             return this.largeur+ this.longueur;
     }s
           public  double surface(){
             return this.largeur*this.longueur; 
}
           public  double diagonal(){
        return sqrt(pow(this.largeur,2)+pow(this.longueur,2));
      }

   


}