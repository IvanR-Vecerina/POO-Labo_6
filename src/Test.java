public class Test {


    public static void main(String args[]){
        Lecon[] lecons = new Lecon[4];
        Lecon l1 = new Lecon(1, 1, 2, "POO", "H03");
        Lecon l2 = new Lecon(2, 5, 3, "SYE", "H03");
        Lecon l3 = new Lecon(3, 7, 1, "POO", "H03");
        Lecon l4 = new Lecon(3, 8, 2, "POO", "H03");

        lecons[0] = l1;
        lecons[1] = l2;
        lecons[2] = l3;
        lecons[3] = l4;

        System.out.println(Lecon.horaire(lecons));

    }

}
