package personnage;

public abstract class Personnage
{
        // Stocke les variables de notre guerrier
    private String nom;
    private String image;
    private int niveauVie;
    private int forceAttaque;

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
        nom = pNom;
    }

    public void setImage(String pImage)
    {
        image = pImage;
    }

    public void setNiveauVie(int pNiveauVie)
    {
        niveauVie = pNiveauVie;
    }

    public void setForceAttaque(int pForceAttaque)
    {
        forceAttaque = pForceAttaque;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString()
    {
        return "Nom : "+ nom + "\nImage : " + image + "\nNiveau de vie : " + niveauVie + "\nForce Attaque : " + forceAttaque;
    }
    

}
