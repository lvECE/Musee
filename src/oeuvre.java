
public class Oeuvre{
    private String nom;
    private int annee;
    private double largeur;
    private double hauteur;
    private Artiste artiste;
    public Oeuvre(String nom, int annee, double largeur, double hauteur){
        this.nom = nom;
        this.annee = annee;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public Oeuvre(String nom, int annee, double largeur, double hauteur, Artiste artiste) {
        this(nom, annee, largeur, hauteur); // délégation
        this.artiste = artiste;
    }

    public String getNom() {return this.nom;}
    public int getAnnee() {return this.annee;}
    public Artiste getArtiste() {return this.artiste;}

}
