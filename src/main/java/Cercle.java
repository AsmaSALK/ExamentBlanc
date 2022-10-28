public class Cercle extends FigureGeometrique{

    private Point centre;
    private double rayon;

    public Cercle(int epaisseur, int contour, int remplissage, Point centre, double rayon) {
        super(epaisseur, contour, remplissage);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double calulerPerimetre() {
        return 2*Math.PI*rayon;

    }



    @Override
    public double calculerSurface() {
        return Math.PI*Math.pow(rayon,2);
    }



    @Override
    public void afficher() {
        System.out.print("Cercle( Centre: "+centre+" Rayon: "+rayon+"Surface:");
        super.afficher();


    }

    @Override
    public void update(Observable observable) {

            super.setRemplissage(((ObservableImpl)observable).getEpaisseur());
            super.setContour(((ObservableImpl)observable).getContour());
            super.setEpaisseur(((ObservableImpl)observable).getRemplissage());


    }
}
