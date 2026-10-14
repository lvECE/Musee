import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public String getNom(){ return this.nom;}
    public int getEtage(){return this.etage;}
    public List<Oeuvre> getOeuvres(){return this.oeuvres;}
}

