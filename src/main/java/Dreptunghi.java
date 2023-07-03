public class Dreptunghi implements FormaGeometrica {

    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime){
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double calculPerimetru() {
        return 2*lungime + 2*latime ;
    }
}
