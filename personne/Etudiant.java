


public class Etudiant extends Personne{

   
       //Attributs Instances

              private dateNaissance; 

              private tuteur; 

       //Attributs Classes ou Static

              private static String getAge;


       //Methodes Instances Concretes 
           
           //Getters
              public  getDateNaissance(){
                  return this.datenaissance;
       }

          //Setters
              public String setDateNaiss(dateNaissance){
                 this.datenaiss=datenaissance;
      }

           //Getters
              public  getTuteur(){
                  return this.tuteur;
       }

           //Setters
              public String setTuteur(tuteur){
                 this.tuteur=tuteur;
      }
 
      //Methodes Static Concretes 
      
         //Getters
              public static String getAge(){
                 return Etudiant.age;
             }

         //Setters
            public static void setAge(String Age){
                Etudiant.affiche = age;
        } 

     //Methode Matier concrete(Static ou instances) 
       //Methode Matier concrete instance

         
        public int getAge() {
    long ageInMillis = new Date().getTime() - getBirthDate().getTime();

    Date age = new Date(ageInMillis);

    return age.getYear();
}


} 

      