package personnage;

public abstract class Personnage
{
        // Stocke les variables de notre guerrier
    protected String nom;
    protected String image;
    protected int niveauVie;
    protected int forceAttaque;

    //*************   ACCESSEURS *************

    // Retourne le nom du guerrier
    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    //*************   MUTATEURS *************

    public void setNom(String pNom)
    {
        this.nom = pNom;
    }

    public void setImage(String pImage)
    {
        this.image = pImage;
    }

    public void setNiveauVie(int pNiveauVie)
    {
        this.niveauVie = pNiveauVie;
    }

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
