public class Obj {

    private int poid;
    private int utilite;
    private int rapportPoidUtilite;


    public Obj(int poid, int utilite){
        this.poid=poid;
        this.utilite=utilite;
        this.rapportPoidUtilite= poid/utilite;
    }

    public int getPoid() {
        return poid;
    }

    public int getUtilite() {
        return utilite;
    }

    public int getRapportPoidUtilite() {
        return rapportPoidUtilite;
    }
}
