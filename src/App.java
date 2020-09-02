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
        Compte c1 = new Compte("Mohmed", 95000);
        Compte c2 = new Compte("fatimetou", 80000, 30000, 50000);
       //pour Tester
    //     c1.ajouteCredit(30000);
        System.out.println(c1.getNumC());
        System.out.println(c2.getNumC());
         
         Compte.infoCompt(c1);
         Compte.infoCompt(c2);
         c2.Situation();
         Compte.Virement(c1, 50000, c2);
         Compte.infoCompt(c1);
         Compte.infoCompt(c2);
         Compte.Virement(c1,50000, c2);
         Compte.infoCompt(c1);
         Compte.infoCompt(c2);

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

