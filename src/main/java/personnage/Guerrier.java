package personnage;

public class Guerrier extends Personnage

{
    private String arme;
    private int bouclier;

    // Constructeur d'un guerrier
    // public Guerrier(){

    //     System.out.println("Création d'un guerrier !");
        
    //     super.nom = "Inconnu";
    //     super.image = "Inconnu";
    //     super.niveauVie = 100;
    //     super.forceAttaque = 50;
    //     arme = "Sabre";
    //     bouclier = 5;
    // }

    // // Constructeur avec paramètres
    // public Guerrier(String pNom, String pImage, int pNiveauVie, int pForceAttaque, String pArme, int pBouclier) {

    //     System.out.println("Création d'un guerrier avec des paramètres");

    //     nom = pNom;
    //     image = pImage;
    //     niveauVie = pNiveauVie;
    //     forceAttaque = pForceAttaque;
    //     arme = pArme;
    //     bouclier = pBouclier;

    // }

    //*************   ACCESSEURS *************

    public String getArme() {
        return arme;
    }

    public int getBouclier() {
        return bouclier;
    }

    //*************   MUTATEURS *************

    public void setArme(String pArme)
    {
        arme = pArme;
    }

    public void setBouclier(int pBouclier)
    {
        bouclier = pBouclier;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString()
    {
        return super.toString() + "\nArme :" + arme + "\nBouclier : " + bouclier;
    }

}
