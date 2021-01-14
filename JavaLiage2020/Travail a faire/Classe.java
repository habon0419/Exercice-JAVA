public class classe implements IInscription{

      //proprietes classe
        //Genere automatiquement    
          private int id;//0
          private String libelle; // null
          private static int nbreClasse;

          //constructeur
           //par defaut
         public Classe(){
             nbreClasse++;
             id=nbreClasse;
        }

         public Classe(String libelle){
            nbreClasse++;
            id=nbreClasse;
            this.libelle=libelle;
        }
       
         
         public String getLibelle(){
          return this.libelle;
        }

         public void setLibelle(String libelle){
          this.libelle=libelle;
        }

         public int getId(){
          return this.id;
        }   

         public Void  setId(int id){
          this.id=id;
       }

         @override
         public String affiche(){
          return "Id: "+this.id+" Libelle "+this.libelle ;
        }
    }


     
       
     

}