package personnage;

public class Guerrier extends Personnage

{
    // Stocke les variables de notre guerrier
    private String nom;
    private String image;
    private int niveauVie;
    private int forceAttaque;
    private String arme;
    private int bouclier;

    // Constructeur d'un guerrier
    public Guerrier(){

        System.out.println("Création d'un guerrier !");
        
        nom = "Inconnu";
        image = "Inconnu";
        niveauVie = 100;
        forceAttaque = 50;
        arme = "Sabre";
        bouclier = 5;
    }

    // Constructeur avec paramètres
    public Guerrier(String pNom, String pImage, int pNiveauVie, int pForceAttaque, String pArme, int pBouclier) {

        System.out.println("Création d'un guerrier avec des paramètres");

        nom = pNom;
        image = pImage;
        niveauVie = pNiveauVie;
        forceAttaque = pForceAttaque;
        arme = pArme;
        bouclier = pBouclier;

    }

    //*************   ACCESSEURS *************

    // Retourne le nom du guerrier
    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public String getNiveauVie() {
        return niveauVie;
    }

    public String getArme() {
        return arme;
    }

    public String getBouclier() {
        return bouclier;
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

    public void setNiveauVie(String pNiveauVie)
    {
        niveauVie = pNiveauVie;
    }

    public void setArme(String pArme)
    {
        arme = pArme;
    }

    public void setBouclier(String pBouclier)
    {
        bouclier = pBouclier;
    }

}
