import java.util.ArrayList;
import java.util.List;

public  class FigureComposite extends FigureGeometrique {
    private List<FigureGeometrique> figureGeometriques=new ArrayList<>();

    public FigureComposite(int epaisseur, int contour, int remplissage) {
        super(epaisseur,contour,remplissage);
    }

    public void addComposant(FigureGeometrique figureGeometrique){
        figureGeometriques.add(figureGeometrique);
    }
    public void removeComposant(FigureGeometrique figureGeometrique){
        figureGeometriques.remove(figureGeometrique);
    }

    public List<FigureGeometrique> getFigureGeometriques() {
        return figureGeometriques;
    }
    public double calulerPerimetre(){
        double somme=0;
        for (FigureGeometrique figureGeometrique:figureGeometriques) {
            somme=figureGeometrique.calulerPerimetre();
        }
        return somme;

    }
    public double calculerSurface(){
        double somme=0;
        for (FigureGeometrique figureGeometrique:figureGeometriques) {
            somme=figureGeometrique.calculerSurface();
        }
        return somme;

    }
    public void afficher(){
        System.out.println("affichage d'un groupe de figure");
        System.out.println("le perimetre de groupe est :"+this.calulerPerimetre()+"la surface du groupe est"+this.calculerSurface());
        for (FigureGeometrique figureGeometrique:figureGeometriques) {
            figureGeometrique.afficher();
        }
    }

    @Override
    public void update(Observable observable) {
        for (FigureGeometrique figureGeometrique : figureGeometriques) {
            figureGeometrique.update(observable);
        }
    }
}
