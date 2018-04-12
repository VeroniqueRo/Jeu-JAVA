package personnage;

/**
 * The type Guerrier.
 */
public class Guerrier extends Personnage

{
    private String arme;
    private int bouclier;

    //*************   ACCESSEURS *************

    /**
     * Gets arme.
     *
     * @return the arme
     */
    public String getArme() {
        return arme;
    }

    /**
     * Gets bouclier.
     *
     * @return the bouclier
     */
    public int getBouclier() {
        return bouclier;
    }

    //*************   MUTATEURS *************

    /**
     * Sets arme.
     *
     * @param pArme the p arme
     */
    public void setArme(String pArme) {
        this.arme = pArme;
    }

    /**
     * Sets bouclier.
     *
     * @param pBouclier the p bouclier
     */
    public void setBouclier(int pBouclier) {
        this.bouclier = pBouclier;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString() {

        return super.toString() + "\n5.Arme : " + arme + "\n6.Bouclier : " + bouclier;
    }
}