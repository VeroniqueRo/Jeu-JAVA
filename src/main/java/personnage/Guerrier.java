package personnage;

public class Guerrier extends Personnage

{
    private String arme;
    private int bouclier;

    //*************   ACCESSEURS *************

    public String getArme() {
        return arme;
    }

    public int getBouclier() {
        return bouclier;
    }

    //*************   MUTATEURS *************

    public void setArme(String pArme) {
        this.arme = pArme;
    }

    public void setBouclier(int pBouclier) {
        this.bouclier = pBouclier;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString() {

        return super.toString() + "\n5.Arme : " + arme + "\n6.Bouclier : " + bouclier;
    }
}