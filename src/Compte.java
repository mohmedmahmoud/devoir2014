

// EXO3-C1
class Compte {
  private int numC;
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
      nTitulaire = nom;
      Solde_initial = solde;
      numC++;
  }

  Compte(String nom, double solde, double dMax, double mDebut) {
      this(nom, solde);
      dMax_Autorizer = dMax;
      mDebut_Max = mDebut;
      numC++;
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
  }

  static void Virement(Compte C, double argent, Compte C2) {
      if (C.Solde_initial > argent) {
          C.Solde_initial -= argent;
          C2.Solde_initial += argent;
          System.out.println("Virement Effectient");
      } else {
          System.out.println("Impossible votre argent n'est pas suffisant ");
      }
  }
  static void infoCompt(Compte compte){
    System.out.println(compte.getNumC());
    System.out.println(compte.getNomT());
    System.out.println(compte.getSolde());
    System.out.println(compte.getMaxDebut());
    System.out.println(compte.getMaxdecouvre());
    

  }
  
  

}