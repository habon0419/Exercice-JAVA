public Class Service{

    //Taille Reservation 
       private final int TAille=10;
    //Taille Reelle ou position d'insertion dans le tableau
       private int nbreDeClasse=0;
       private final Classe[] tabClasses;
    //Taille Reelle ou position d'insertion dans le tableau 
        private int nbrePersonne=0;
        private final Personne  tabPersonnes[];

        public Service(){
            tabClasses=new Classe[TAILLE];
            tabPersonnes=new Personne[TAILLE];
        }     

        public Void ajouterClasse(Classe classe){
            tabClasses[nbreDeClasse]=classe;
            nbreDeClasse++;
        }

        public Void inscrireEtudiant(Etudiant et){
            tabPersonnes[nbreDePersonne]=et;
            nbreDePersonne++;
        }


        public Void listerClasse(){

            For(int i=0;i<nbreDeClasse;i++){
                System.out.println(tabClasses[i].affiche());
            }
        }

        public Void listerPersonne(){

            For(int i=0;i<nbreDePersonne;i++){
                System.out.println(tabPersonnes[i].affiche());
            }
        }
    
       
}