import java.util.Scanner;

public class main {



    public static void main(String[] args) {




        // Création des 2 sac
        System.out.println("Taille du sac 1");
        Scanner TailleSac1 = new Scanner(System.in);
        int i = TailleSac1.nextInt();
        System.out.println("Taille du sac 2");
        Scanner TailleSac2 = new Scanner(System.in);
        int j = TailleSac2.nextInt();

        Sac sac1 = new Sac(i);
        Sac sac2 = new Sac(j);
        System.out.println("taille sac 1 :");
        System.out.println(sac1.getTaille());

        System.out.println("taille sac 2 :");
        System.out.println(sac2.getTaille());




        // creation du tableau d'objet
        System.out.println("Combien d'objet disposez vous?");
        Scanner nbObjet = new Scanner(System.in);
        EnsembleObjet tableObjet =new EnsembleObjet( nbObjet.nextInt());

        for (i=0; i<tableObjet.getNbObjet(); i++){
            System.out.print("Pour l'objet ");
            System.out.print(i+1);
            System.out.println(": ");
            System.out.println("son poid : ");
            Scanner poidObject = new Scanner(System.in);
            int poid =poidObject.nextInt();
            System.out.println(poid);
            System.out.println("son utilite : ");
            Scanner utiliteObject = new Scanner(System.in);
            int utilite =utiliteObject.nextInt();
            System.out.println(utilite);
            Obj obj =new Obj(poid, utilite);
            tableObjet.addObjet(obj);
        }
        tableObjet.affiche();
        System.out.println("nb objet  :");
        System.out.println(tableObjet.getNbObjet());

        AlgoPerso algoP = new AlgoPerso(sac1,sac2,tableObjet);
        int utilitePerso = algoP.getAllSac();
        System.out.print("utilite pour l'algo perso: ");
        System.out.println(utilitePerso);

        algoBorne algoB = new algoBorne(sac1,sac2,tableObjet);
        int utiliteBorne =algoB.borne();
        System.out.print("utilite pour l'algo de born: ");
        System.out.println(utiliteBorne);
/*
        AlgotithmeOptimal algoO =  new AlgotithmeOptimal(tableObjet,sac1,sac2);
        int utiliteOpti = algoO.run();
        System.out.print("utilite pour l'algo de optimal: ");
        System.out.println(utiliteOpti);
*/







    }

}
