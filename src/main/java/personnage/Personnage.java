package personnage;

/**
 * The type Personnage.
 */
public abstract class Personnage
{
    /**
     * The Nom.
     */
// Stocke les variables de notre guerrier
    protected String nom;
    /**
     * The Image.
     */
    protected String image;
    /**
     * The Niveau vie.
     */
    protected int niveauVie;
    /**
     * The Force attaque.
     */
    protected int forceAttaque;

    //*************   ACCESSEURS *************

    /**
     * Gets nom.
     *
     * @return the nom
     */
// Retourne le nom du guerrier
    public String getNom() {
        return nom;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Gets niveau vie.
     *
     * @return the niveau vie
     */
    public int getNiveauVie() {
        return niveauVie;
    }

    /**
     * Gets force attaque.
     *
     * @return the force attaque
     */
    public int getForceAttaque() {
        return forceAttaque;
    }

    //*************   MUTATEURS *************

    /**
     * Sets nom.
     *
     * @param pNom the p nom
     */
    public void setNom(String pNom)
    {
        this.nom = pNom;
    }

    /**
     * Sets image.
     *
     * @param pImage the p image
     */
    public void setImage(String pImage)
    {
        this.image = pImage;
    }

    /**
     * Sets niveau vie.
     *
     * @param pNiveauVie the p niveau vie
     */
    public void setNiveauVie(int pNiveauVie)
    {
        this.niveauVie = pNiveauVie;
    }

    /**
     * Sets force attaque.
     *
     * @param pForceAttaque the p force attaque
     */
    public void setForceAttaque(int pForceAttaque)
    {
        this.forceAttaque = pForceAttaque;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString()
    {
        return "1.Nom : "+ nom + "\n2.Image : " + image + "\n3.Niveau de vie : " + niveauVie + "\n4.Force Attaque : " + forceAttaque;
    }

}
