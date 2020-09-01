public class App {
    public static void main(String[] args) throws Exception {

        // --------------exo1------------------
        for (int i = 2; i < 13; i += 2) {
            if (i == 6) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        // -------------fin-exo1------------------

        // --------------exo2------------------
        // exo2-Q1
        Personne Mohmed = new Personne("Mohamed", 70, 25);
        Personne Fatma = new Personne("Fatma", 60);

        // -------------fin-exo2------------------

        // --------------exo3------------------
        System.out.println( "--------------exo3------------------");
        Compte c1 = new Compte("Med Ahmed", 25000);
        Compte c2 = new Compte("Moussa Fall", 75000, 20000, 50000);
       //pour Tester
        c1.ajouteCredit(30000);
        System.out.println(c2.getNumC());
        c2.Situation();
      Compte.Virement(c1, 10000, c2);
      Compte.infoCompt(c1);
        

    }
}

// exo2-Q1
class Personne {
    double Poid;
    String Nom;
    int Age;

    Personne(String n, double p) {
        Nom = n;
        Poid = p;
    }

    Personne(String Nom, double Poid, int Age) {
        this(Nom, Poid);
        this.Age = Age;
    }

}

