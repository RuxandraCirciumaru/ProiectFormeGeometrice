public class Triunghi implements FormaGeometrica {

    private double cateta1;
    private double cateta2;
    private double ipotenuza;

    public Triunghi (double cateta1, double cateta2, double ipotenuza){
        this.cateta1 = cateta1;
        this.cateta2 = cateta2;
        this.ipotenuza = ipotenuza;
    }

    @Override
    public double calculPerimetru() {
        return cateta2 + cateta1 + ipotenuza;
    }
}
