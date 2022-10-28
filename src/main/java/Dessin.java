import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Serializable {
    private String name;
    private ITraitement iTraitement;

    private List<FigureGeometrique> figureGeometriques=new ArrayList<>();

    public void Traiter(){
        iTraitement.traiter();
    }
    public void Ajouter(FigureGeometrique figureGeometrique){

        figureGeometriques.add(figureGeometrique);
    }
    public void supprimer(FigureGeometrique figureGeometrique){
        figureGeometriques.remove(figureGeometrique);

    }
    public void Afficher(){
        System.out.println("Affichage du "+ name);
        for (FigureGeometrique figureGeometrique:figureGeometriques) {
            figureGeometrique.afficher();
        }

    }
    public void serialiser(){
        System.out.println("serialiser le desin");

    }

    public void setiTraitement(ITraitement iTraitement) {
        this.iTraitement = iTraitement;
    }

    public ITraitement getiTraitement() {
        return iTraitement;
    }
}
