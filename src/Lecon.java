public class Lecon {
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String matiere;
    private String salle;
    private Professeur professeur;

    public Lecon(int jourSemaine, int periodeDebut, int duree, String matiere, String salle) {
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.matiere = matiere;
        this.salle = salle;
    }

    public Lecon(int jourSemaine, int periodeDebut, int duree, String matiere, String salle, Professeur professeur){
        /*this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.matiere = matiere;
        this.salle = salle;*/
        this(jourSemaine, periodeDebut, duree, matiere, salle);
        this.professeur = professeur;

        this.professeur.getListeLecon().add(this);
    }

    static public String horaire(Object args){
        return "";
    }


}
