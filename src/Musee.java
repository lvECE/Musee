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

