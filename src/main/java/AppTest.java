public class AppTest {
    public static void main(String[] args) {
        Dessin dessin=new Dessin();

        //tester le pattern strategy pour la methode traiter  dynamiquement
        dessin.setiTraitement(new TraitementImpl1());
        dessin.Traiter();
        dessin.setiTraitement(new TraitementImpl2());
        dessin.Traiter();



        //creation des objets de type figure et tester ses methodes
        FigureGeometrique c1=new Cercle(1,2,46,new Point(1,4),5);
        c1.afficher();
        FigureGeometrique c2=new Cercle(2,2,255,new Point(100,4),10);
        c2.afficher();
        FigureGeometrique r1=new Rectangle(1,2,46,10,8);
        r1.afficher();
        FigureGeometrique r2=new Rectangle(4,255,0,120,2);
        r2.afficher();
        //lier les figure avec le desin et tester le dessin
        dessin.Ajouter(c1);
        dessin.Ajouter(c2);
        dessin.Ajouter(r1);
        dessin.Ajouter(r2);

        //creation d'un groupe de figures et les lier aver le dessin
        FigureComposite f1=new FigureComposite(1,2,46) ;
        FigureComposite f2=new FigureComposite(2,6,0) ;
        FigureComposite f3=new FigureComposite(7,1,99) ;
        f2.addComposant(new  Cercle(1,2,46,new Point(1,4),5));
        f2.addComposant(new Rectangle(1,2,46,10,8));
        f3.addComposant( new Rectangle(4,255,0,120,2));
        f1.addComposant(f2);
        f1.addComposant(f3);
        dessin.Ajouter(f1);



        //afficher les element du dessin
        dessin.Afficher();

        //supprission du c1 et f3 de Dessin
        dessin.supprimer(c2);
        dessin.supprimer(f3);
        dessin.Afficher();

        //tester le design patter observer
        ObservableImpl observable=new ObservableImpl();
        observable.addObserver(f1);
        observable.addObserver(c1);
        observable.setEpaisseur(10);
        observable.setContour(11);
        observable.setRemplissage(12);
        observable.notifyObserver();
        System.out.println("============================================");
        dessin.Afficher();



    }
}
