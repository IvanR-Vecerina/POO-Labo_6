public class Personne {
    private String prenom;
    private String nom;

    public Personne(){
        prenom = "";
        nom = "";
    }

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString(){
        return prenom + " " + nom;
    }
}
