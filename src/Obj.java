public class Obj {

    private int poid;
    private int utilite;
    private float rapportPoidUtilite;


    public Obj(int poid, int utilite){
        this.poid=poid;
        this.utilite=utilite;
        this.rapportPoidUtilite= utilite/poid;
    }

    public int getPoid() {
        return poid;
    }

    public int getUtilite() {
        return utilite;
    }

    public float getRapportUtilitePoid() {
        return rapportPoidUtilite;
    }
}
