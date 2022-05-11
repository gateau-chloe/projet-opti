public class algoBorne {
    private EnsembleObjet listeObjet;
    private Sac sac1;
    private Sac sac2;

    //on creer un nouveau sac à partir du 1 et 2
    public Sac fusionSac(){
        return new Sac(sac1.getTaille()+ sac2.getTaille());
    }
    public void born2() {
        //a remplacer par le retour de la fonction de trie dans Ensemble objet
        listeObjet.triUtilite();
        EnsembleObjet trie = listeObjet;
        // a remplacer par le fonction qui addition les 2 sacs
        Sac sac = fusionSac();
        int iemeObjet = 0;
        while (sac.getEspaceLibre() != 0 && iemeObjet != trie.getNbObjet()) {
            Obj obj = trie.getTableau().get(iemeObjet);
            sac.addObjet(obj);
            iemeObjet++;
        }

    }
}