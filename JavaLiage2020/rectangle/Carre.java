

public class Carre extends Figure {

  //Methode Matier abstraites  (Static ou instances)

     //Redefinition
        //Methode Matier abstraites instance
           public  double demiperimetre();{
                return this.longueur*2;
}
           public abstract double surface(){
              return this.longueur*this.longueur;
}
           public abstract double diagonal(){
                  return  sqrt(pow(this.longueur,2)+pow(this.longueur,2));
}

   


}