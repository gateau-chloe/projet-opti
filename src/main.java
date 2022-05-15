import java.io.IOException;

public class main {



    public static void main(String[] args) throws IOException {

        FichierExcel fichier = new FichierExcel("C:\\Users\\chloe\\Documents\\opti\\test");
        DonneRetourAlgo[] tab = new DonneRetourAlgo[2000];
        int compteur=0;
       for (int i=5; i<=1000; i=i+5) {
           for (int j = 0; j < 10; j++) {
               int min =0;
               int max=0;
               if (i>50){
                    min =50;
                    max = 100;
               }
               else {
                    min = i;
                    max = 15+i;
               }
               creationAleatoire creat = new creationAleatoire(min, max, 30, 1, 10, 1);

               Sac sac1 = creat.creatSac();
               Sac sac2 = creat.creatSac();
               System.out.println("taille sac 1 :");
               System.out.println(sac1.getTaille());

               System.out.println("taille sac 2 :");
               System.out.println(sac2.getTaille());

               EnsembleObjet tableObjet = creat.creatEnsembleObjet(i);
               //tableObjet.affiche();
               System.out.println("nb objet  :");
               System.out.println(tableObjet.getNbObjet());

               AlgoPerso algoP = new AlgoPerso(sac1, sac2, tableObjet);
               int utilitePerso = algoP.getAllSac();
               System.out.print("utilite pour l'algo perso: ");
               System.out.println(utilitePerso);
               System.out.println("_________________________________________ ");

               algoBorne algoB = new algoBorne(sac1, sac2, tableObjet);
               int utiliteBorne = algoB.borne();
               System.out.print("utilite pour l'algo de born: ");
               System.out.println(utiliteBorne);
               System.out.println("_________________________________________ ");


               AlgotithmeOptimal algoO = new AlgotithmeOptimal(tableObjet, sac1, sac2);
               int utiliteOpti = algoO.run();
               System.out.print("utilite pour l'algo de optimal: ");
               System.out.println(utiliteOpti);
               System.out.println("_________________________________________ ");
               System.out.print("rapport algo de optimal: ");
               float testRapport =(float)utiliteOpti/(float)utilitePerso;
               System.out.println(testRapport);
               System.out.print("rapport borne ");
               testRapport = utiliteOpti/utiliteBorne;
               System.out.println(testRapport);
               DonneRetourAlgo test = new DonneRetourAlgo(i, utiliteOpti, utiliteBorne, utilitePerso);
               tab[compteur] = test;
               compteur++;
               System.out.println(test.toString());
           }

       }
           fichier.write(tab);






    }

}
