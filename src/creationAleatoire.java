public class creationAleatoire {
        private int minTailleSac;
        private int maxTailleSac;
        private int maxUtilite;
        private int minUtilite;
        private int maxPoid;
        private int minPoid;


    public creationAleatoire(int minTailleSac, int maxTailleSac, int maxUtilite,int minUtilite, int maxPoid, int minPoid){
            this.maxUtilite = maxUtilite;
            this.minUtilite = minUtilite;
            this.maxTailleSac = maxTailleSac;
            this.minTailleSac = minTailleSac;
            this.maxPoid = maxPoid;
            this.minPoid = minPoid;
        }


        public Sac creatSac(){
            int nombreAleatoire = minTailleSac + (int)(Math.random() * ((maxTailleSac - minTailleSac) + 1));
            Sac sac = new Sac(nombreAleatoire);
            return sac;
        }

        public EnsembleObjet creatEnsembleObjet(int nbObjet){
            EnsembleObjet ensembleObjet = new EnsembleObjet(nbObjet);

            for (int i=0; i<nbObjet; i++){
                int utiliteAleatoire = minUtilite + (int)(Math.random() * ((maxUtilite - minUtilite) + 1));
                int poidAleatoire = minPoid + (int)(Math.random() * ((maxPoid - minPoid) + 1));
                ensembleObjet.addObjet(new Obj(poidAleatoire,utiliteAleatoire));
            }
            return  ensembleObjet;
        }




}
