public abstract class Personne{

         //Attributs Instances
            protected  id;
            protected  Nom;
            protected  Prenom;


        //Methodes Instances Concretes 
            //Constructeur
               public Personne(){

        }
           //Getters
              public  getId(){
                  return this.id;
       }

          //Setters
              public String setId(id){
                 this.id=id;
      }


         //Getters
              public  getNom(){
                  return this.nom;
       }

          //Setters
              public String setNom(nom){
                 this.nom=nom;
      }

     
       //Getters
              public  getPrenom(){
                  return this.Prenom;
       }

          //Setters
              public String setPrenom(prenom){
                 this.prenom=prenom;
      }



       
  }
   