import java.time.LocalDate;

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
