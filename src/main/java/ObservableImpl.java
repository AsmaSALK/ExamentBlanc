import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int epaisseur;
    private int contour;
    private int remplissage;
    private List<FigureGeometrique> figureGeometriques=new ArrayList<>();

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public void setContour(int contour) {
        this.contour = contour;
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public int getContour() {
        return contour;
    }

    public int getRemplissage() {
        return remplissage;
    }

    @Override
    public void addObserver(FigureGeometrique figureGeometrique) {
        figureGeometriques.add(figureGeometrique);
    }

    @Override
    public void removeObserver(FigureGeometrique figureGeometrique) {
        figureGeometriques.remove(figureGeometrique);
    }

    @Override
    public void notifyObserver() {

        for (FigureGeometrique figureGeometrique:figureGeometriques){

            figureGeometrique.update(this);
        }

    }
}
