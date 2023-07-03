public class Patrat implements FormaGeometrica {
    private double latura;

    public Patrat(double latura){
        this.latura = latura;
    }

    @Override
    public double calculPerimetru() {
        return 4* latura;
    }
}
