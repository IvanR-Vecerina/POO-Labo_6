import java.util.ArrayList;

public class Professeur extends Personne {
    private String abreviation;
    private ArrayList<Lecon> listLecon = new ArrayList<>();

    public Professeur(String nom, String prenom){
        super(nom, prenom);

        abreviation = prenom.charAt(0) + nom.substring(0, 2);
    }

    public String abreviation(){
        return "";
    }

    public String horaire(){
        return "";
    }

    @Override
    public String toString(){
        return "";
    }

    public ArrayList<Lecon> getListeLecon(){
        return listLecon;
    }
}
