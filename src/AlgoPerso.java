import java.util.ArrayList;

public class AlgoPerso {

    Sac sac1, sac2;
    EnsembleObjet listeObjet;


    public AlgoPerso(Sac sac1, Sac sac2,EnsembleObjet listeObjet) {
        this.sac1 = sac1;
        this.sac2 = sac2;
        this.listeObjet = listeObjet;
    }

    //intervertir les deux sac test 1 puis l'autre
    public ArrayList<Sac> remplissageSac(Sac sac1, Sac sac2){
        listeObjet.triUtilite();
        EnsembleObjet trie = listeObjet;
        int iemeObjet = 0;
        ArrayList<Sac> listeSac = new ArrayList<>();
        do{
            Obj obj = trie.getTableau().get(iemeObjet);
            boolean estDansSac = sac1.addObjet(obj);
            iemeObjet++;
            if(estDansSac == false){
                sac2.addObjet(obj);
            }
        }while ((sac1.getEspaceLibre() != 0 || sac2.getEspaceLibre() != 0) && ( iemeObjet != trie.getNbObjet()-1 ));

        listeSac.add(sac1);
        listeSac.add(sac2);
        return listeSac;
    }

    public int getAllSac(){
        ArrayList<Sac> listeSac1 = remplissageSac(sac1, sac2);
        ArrayList<Sac> listeSac2 = remplissageSac(sac1, sac2);
        int utilite1 = 0, utilite2 = 0;

        for(int i=0; i < listeSac1.size(); i++){
            utilite1 = utilite1 + listeSac1.get(i).getUtilite();
        }

        for(int i=0; i < listeSac2.size(); i++){
            utilite2 = utilite2 + listeSac2.get(i).getUtilite();
        }

        if (utilite1 > utilite2){
            return utilite1;
        }
        return utilite2;
    }
}
