public class algoBorne {
    private EnsembleObjet listeObjet;
    private Sac sac1;
    private Sac sac2;

    public algoBorne(Sac sac1, Sac sac2, EnsembleObjet listeObjet){
        this.sac1 = sac1;
        this.sac2 =sac2;
        this.listeObjet =listeObjet;
    }
    //on creer un nouveau sac à partir du 1 et 2
    public Sac fusionSac(){
        return new Sac(sac1.getTaille()+ sac2.getTaille());
    }
    public int borne() {
        //a remplacer par le retour de la fonction de trie dans Ensemble objet
        listeObjet.triUtilite();
        //listeObjet.affiche();
        EnsembleObjet trie = listeObjet;
        // a remplacer par le fonction qui addition les 2 sacs
        Sac sac = fusionSac();
        int iemeObjet = 0;
        while (sac.getEspaceLibre() != 0 && iemeObjet != trie.getNbObjet()) {
            Obj obj = trie.getTableau().get(iemeObjet);
            sac.addObjetDecoupe(obj);
            iemeObjet++;
        }
        return sac.getUtilite();
    }
}