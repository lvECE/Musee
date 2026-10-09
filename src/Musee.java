import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Musee {
    private String nom;
    private Adresse adresse;
    private List<Salle> salles;
    public Musee(String nom, Adresse adresse, Salle premiereSalle){
        this.nom = nom;
        this.adresse = adresse;
        this.salles = new ArrayList<>();
        this.salles.add(premiereSalle);
    }
    public void ajouterSalle(Salle salle){
        this.salles.add(salle);
    }
    public List<Salle> getSalles(){
        return Collections.unmodifiableList(salles);
    }
}

public class Salle{
    private int etage;
    private String nom;
    private double superficie;
    private List<Oeuvre> oeuvres;
    public Salle(int etage, String nom, double superficie){
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
        this.oeuvres = new ArrayList<>();
    }
    public void ajouterOeuvre(Oeuvre oeuvre){
        this.oeuvres.add(oeuvre);
    }
    public List<Oeuvre> getOeuvre(){
        return Collections.unmodifiableList(oeuvres);
    }

}

public class Adresse{
    private int numero;
    private String rue;
    private String codePostal;
    private String ville;
    public Adresse(int numero, String rue, String codePostal, String ville){
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    public int getNumero() {return this.numero;}
    public String getRue() {return this.rue;}
    public String getCodePostal() {return this.codePostal;}
    public String getVille() {return this.ville;}
}

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

public class Artiste{
    private String nom;
    private String prenom;
    private String nationalite;
    private LocalDate dateNaissance;
    public Artiste(String nom, String prenom, String nationalite, LocalDate dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
    }
    public String getNom(){return this.nom;}
    public String getPrenom(){return this.prenom;}
    public String getNationalite(){return this.nationalite;}
    public LocalDate getDate(){return this.dateNaissance;}
}

