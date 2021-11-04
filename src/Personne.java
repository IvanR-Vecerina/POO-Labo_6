public class Personne {
    private String prenom;
    private String nom;

    public Personne(){
        prenom = "";
        nom = "";
    }

    public Personne(String nom, String prenom){
        this.nom = new String(nom);
        this.prenom = new String(prenom);
    }

    @Override
    public String toString(){
        return "";
    }
}
