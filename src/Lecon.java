import java.util.Objects;

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

    static public String horaire(Lecon[] lecons){
        String[][] tab = new String[5][11];
        String tmp;

        for (Lecon lecon : lecons) {
            tmp = lecon.professeur == null ? "   " : lecon.professeur.abreviation();

            tab[lecon.jourSemaine][lecon.periodeDebut] = lecon.matiere + "   " + lecon.salle + " " + tmp;

            for (int i = 1; i < lecon.duree; i++){
                tab[lecon.jourSemaine][lecon.periodeDebut+i] = "";
            }
        }


        String   days     = "     | Lun         | Mar         | Mer         | Jeu         | Ven         |\n"+
                            "     |-------------|-------------|-------------|-------------|-------------|\n";
        String[] periods = {" 8:30|",
                            " 9:15|",
                            "10:25|",
                            "11:15|",
                            "12:00|",
                            "13:15|",
                            "14:00|",
                            "14:55|",
                            "15:45|",
                            "16:35|",
                            "17:20|"};

        String periodBorder = "-------------";
        String emptyCell    = "             ";

        String toPrint = days;

        for (int i = 0; i < tab[0].length; i++){
            toPrint += periods[i];
            for (int j = 0; j < tab.length; j++){
                tmp = tab[j][i] == null || tab[j][i].equals("") ? emptyCell : tab[j][i];
                toPrint += tmp + "|";
            }
            toPrint += "\n     |";

            for (int j = 0; j < tab.length; j++){
                tmp = tab[j][i+1 < tab[0].length ? i+1: 0] == "" ? emptyCell : periodBorder;
                toPrint += tmp + "|";
            }
            toPrint += "\n";

        }


        return toPrint;
    }


}
