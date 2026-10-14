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
