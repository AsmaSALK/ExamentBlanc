import java.util.ArrayList;
import java.util.List;

public abstract class FigureGeometrique {
    private int epaisseur;
    private int contour;
    private int remplissage;


    public FigureGeometrique(int epaisseur, int contour, int remplissage) {
        this.epaisseur = epaisseur;
        this.contour = contour;
        this.remplissage = remplissage;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public void setContour(int contour) {
        this.contour = contour;
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
    }

    public abstract double calulerPerimetre();
    public abstract double calculerSurface();
    public void afficher(){
        System.out.println(" Contour: "+contour+" Epaisseur :"+epaisseur+" Remplissage:"+remplissage+"Perimetre: "+this.calulerPerimetre()+" Surface: "+this.calculerSurface()+" )");
    }
    public abstract void update(Observable observable);
}
