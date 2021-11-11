import java.util.ArrayList;

public class Groupe {
    private int numero;
    private int trismestre;
    private String orientation;

    ArrayList<Lecon> listeLecons = new ArrayList<>();

    public Groupe(int numero, int trismestre, String orientation){
        this.numero = numero;
        this.trismestre = trismestre;
        this.orientation = orientation;
    }

    public String horaire(){
        return "";
    }

    public String nom(){
        return orientation + trismestre + "-" + numero;
    }

    public int nombreEtudiants(){
        return listeLecons.size();
    }

    public void definirLecon(Lecon args){

    }
}
