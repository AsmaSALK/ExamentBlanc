import java.util.ArrayList;
import java.util.List;

public abstract class FigureComposit {
    private int epaisseur;
    private int contour;
    private int remplissage;
    private List<FigureComposant> composants = new ArrayList<>();

    public abstract void calulerPerimetre();
    public abstract void calculerSurface();
}
