public class Service  extends IEmploye{

     //Attributs Instances

      private id;
      protected libelle;

     //Attributs Classes ou Static

     private static String Affiche;
     private static String compare;

    

      
       //Methodes Instances Concretes 

           
      //Getters
              public  getId(){
                  return this.id;
       }

       //Setters
              public String setId(id){
                 this.id=id;
      }


         //Getters
              public  getLibelle(){
                  return this.libelle;
       }

          //Setters
              public String setLibelle(libelle){
                 this.libelle=libelle;
      }

     
         //Methodes Static Concretes 
      
         //Getters
              public static String getAffiche(){
                 return IEmploye.affiche;
             }

         //Setters
            public static void setAffiche(String affiche){
                IEmploye.affiche = affiche;
        }

         
      
         //Getters
              public static String getCompare(){
                 return  IEmploye.affiche;
             }

         //Setters
            public static void setCompare(String compare){
                 IEmploye.compare = compare;
        }




         


}