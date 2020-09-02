
// EXO3-C1
class Compte {
    static private int id=0;
    private int numC=0;
    private String nTitulaire;
    private double dMax_Autorizer = 40000;
    private double mDebut_Max = 90000;
    private double Solde_initial = 0;

    int getNumC() {
        return numC;
    }

    double getSolde() {
        return Solde_initial;
    }

    String getNomT() {
        return nTitulaire;
    }

    double getMaxDebut() {
        return mDebut_Max;
    }

    double getMaxdecouvre() {
        return dMax_Autorizer;
    }

    Compte(String nom, double solde) {
        if (mDebut_Max < solde) {
            nTitulaire = nom;
            Solde_initial = solde;
            numC=++id;
        } else {
            System.out.println("Impossible");
        }
    }

    Compte(String nom, double solde, double dMax, double mDebut) {
        // this(nom, solde);
        if (mDebut < solde) {
            this.nTitulaire = nom;
            this.Solde_initial = solde;
            dMax_Autorizer = dMax;
            mDebut_Max = mDebut;
            numC=++id;
        } else {
            System.out.println("Impossible");
        }
    }

    void Situation() {
        if (dMax_Autorizer == 0) {
            System.out.println("Pas de decouvert");
        } else {
            System.out.println("IL y a de decouvert");
        }

    }

    void ajouteCredit(int creditA) {
        Solde_initial += creditA;
        System.out.println("vous avez ajouté "+creditA+" de votre credit ");
    }

    void retirerArgent(int argent) {
        if (mDebut_Max > Solde_initial + argent) {
            Solde_initial -= argent;
        } else {
            System.out.println("Impossible ");
            System.out.println("Virement Effectient");
        }

    }

    static void Virement(Compte C, double argent, Compte C2) {
        if (C.Solde_initial + C.dMax_Autorizer > argent) {
            C.Solde_initial -= argent;
            C2.Solde_initial += argent;
            System.out.println("Virement Effectient");
        } else  {
            System.out.println("Impossible votre argent n'est pas suffisant ");
        }
    }

    static void infoCompt(Compte compte) {
        System.out.println(compte.getNumC());
        System.out.println(compte.getNomT());
        System.out.println(compte.getSolde());
        System.out.println(compte.getMaxDebut());
        System.out.println(compte.getMaxdecouvre());

    }

}