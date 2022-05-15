import java.util.ArrayList;

public class EnsembleObjet {

    private int nbObjet;
    private ArrayList<Obj> tableau;


    public EnsembleObjet(int nbObjet){
        this.nbObjet=nbObjet;
        this.tableau=new ArrayList<>();
    }

    public ArrayList<Obj> getTableau() {
        return tableau;
    }

    public int getNbObjet() {
        return nbObjet;
    }

    public void addObjet(Obj objet){
           tableau.add(objet);
    }



    // trie des deux tableau
    public void triUtilite()
    {
        for (int i = 0; i < tableau.size() - 1; i++)
        {
            int p = i;
            for (int j = i + 1; j < tableau.size(); j++)
            {
                if (tableau.get(j).getRapportUtilitePoid() > tableau.get(p).getRapportUtilitePoid()){
                    p= j;
                }
            }
            Obj max = tableau.get(p);
            tableau.set(p,tableau.get(i));
            tableau.set(i,max);
        }

    }

    public void affiche(){
        System.out.print("n° objet");
        for (int i=1; i<=nbObjet; i++){
            System.out.print(i);
        }
        System.out.println("----------------------");

        System.out.print("pi");
        for (int i=0; i<nbObjet; i++){
            Obj obj =tableau.get(i);
            System.out.print(obj.getPoid());
            System.out.print(",");

        }
        System.out.println("----------------------");
        System.out.print("wi");
        for (int i=0; i<nbObjet; i++){
            Obj obj =tableau.get(i);
            System.out.print(obj.getUtilite());
            System.out.print(",");

        }

    }

}
