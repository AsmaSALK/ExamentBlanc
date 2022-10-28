public class Rectangle extends FigureGeometrique{
    private int largeur;
    private int hauteur;

    public Rectangle(int epaisseur, int contour, int remplissage, int largeur, int hauteur) {
        super(epaisseur, contour, remplissage);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calulerPerimetre() {
        return 2*largeur*hauteur;
    }

    @Override
    public double calculerSurface() {
        return largeur*hauteur;
    }

    @Override
    public void afficher() {
        System.out.print("Rectangle( largeur: "+largeur+" Hauteur: "+hauteur);
        super.afficher();
    }

    @Override
    public void update(Observable observable) {

        super.setRemplissage(((ObservableImpl)observable).getEpaisseur());
        super.setContour(((ObservableImpl)observable).getContour());
        super.setEpaisseur(((ObservableImpl)observable).getRemplissage());


    }
}
