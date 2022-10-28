public interface Observable {
    public void addObserver(FigureGeometrique figureGeometrique);
    public void removeObserver(FigureGeometrique figureGeometrique);
    public void notifyObserver();
}
