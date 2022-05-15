import java.io.*;

public class FichierExcel {

    private String path;

    public FichierExcel(String paths) throws IOException {
        this.path = paths;
    }

    public void creatFichier() throws IOException {
        FileWriter fichier = new FileWriter(path);
        fichier.write("nb obj;Algo Optimal;Algo Borne;Algo interversion sac");
        fichier.flush();


    }

    public void addLigne(int[] valeurs) {
        try {
            FileWriter fichier = new FileWriter(path);
            fichier.write(valeurs[0]);
            fichier.append(';');
            fichier.write(valeurs[1]);
            fichier.append(';');
            fichier.write(valeurs[2]);
            fichier.append(';');
            fichier.write(valeurs[3]);
            fichier.append(';');
            fichier.append('\n');
            fichier.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(DonneRetourAlgo[] tab) {
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("nb obj;Algo Optimal;Algo Borne;Algo interversion sac;Rapport Opti/perso;Rapport Borne/erpso\n");
            System.out.println("taille tab ");
            System.out.println(tab.length);

            for( int i=0; i< tab.length; i++){
                System.out.println(i);

                sb.append(tab[i].getNbObjet());
                sb.append(';');
                sb.append(tab[i].getAlgoOpti());
                sb.append(';');
                sb.append(tab[i].getAlgoBorne());
                sb.append(';');
                sb.append(tab[i].getAlgoPerso());
                sb.append(';');
                sb.append(tab[i].getRapportOptiPerso());
                sb.append(';');
                sb.append(tab[i].getRapportBornePerso());

                sb.append('\n');

            }
            writer.write(sb.toString());
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
