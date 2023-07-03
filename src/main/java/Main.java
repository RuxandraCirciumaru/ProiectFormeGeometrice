import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti forma geometrica pentru care vreti sa calculati perimetrul(1.dreptunghi,2.triunghi,3.patrat): ");
        String forma = sc.nextLine();
        switch (forma){
            case "dreptunghi":
                System.out.println("Introduceti dimensiunile lungimii si latimii :");
                double lungime = Double.parseDouble(sc.nextLine());
                double latime = Double.parseDouble(sc.nextLine());
                Dreptunghi dreptunghi = new Dreptunghi(lungime,latime);
                double perimetruDreptunghi = dreptunghi.calculPerimetru();
                System.out.println("Perimetrul dreptunghiului este :" + perimetruDreptunghi);
                break;

            case "triunghi":
                System.out.println("Introduceti dimensiunile triunghiului(cateta1,cateta2,ipotenuza)");
                double cateta1= Double.parseDouble(sc.nextLine());
                double cateta2 = Double.parseDouble(sc.nextLine());
                double ipotenuza = Double.parseDouble(sc.nextLine());
                Triunghi triunghi = new Triunghi(cateta1,cateta2,ipotenuza);
                double perimetruTriunghi = triunghi.calculPerimetru();
                System.out.println("Perimetrul triunghiului este: " +perimetruTriunghi);
                break;
            case "patrat":
                System.out.println("Introduceti dimensiunile laturii: ");
                double latura = Double.parseDouble(sc.nextLine());
                Patrat patrat = new Patrat(latura);
                double perimetruPatrat = patrat.calculPerimetru();
                System.out.println("Perimetrul patratului este: " + perimetruPatrat);
                break;

            default:
                System.out.println("Optiune invalida.");


        }

    }
}
