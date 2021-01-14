public abstract class Personne implements IInscription{

         //Generer id
            protected  id;
            protected  Nom;
            protected  Prenom;

            //Attributs Instances
              private static int nbrePers;

      //Constructeur par defaut=>creer un  objet de type personne   
               public Personne(){
                nbrePersonne++;
                id=nbrePersonne;
        }      
        //surcharge=>creer un objet de type personne
        //en plus  il peut initialiser 

      personne(String nom,String prenom){
          nbrePersonne++;
          id=nbrePersonne;
         this.nom = nom;
         this.prenom = prenom;
      }

      public  int getId(){
         return id;
      }

       public  String getNom(){
         return Nom;
      }

       public  String getPreNom(){
         return prenom;
      }

      public void setId(int id){
         this.id= id;
      }

        public void setNom(String nom){
         this.nom= nom;
      }

      
        public void setPrenom(String prenom){
         this.prenom= prenom;
      }

      


           @Override
           publi String affiche{
              return "Id: "+this.id+" Nom: "+this.nom+" prenom: "+this.prenom;

           } 



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
   