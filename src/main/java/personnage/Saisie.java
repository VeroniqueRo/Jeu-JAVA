package personnage;

import java.util.Scanner;

public class Saisie {

    private static Scanner sc = new Scanner(System.in);

    //************************ Méthode pour donner un nom au personnage ****************************************
    public static String creationNom() {
        
        String nomP = sc.nextLine();
        // Condition : Pour forcer à entrer au moins un caractère
        while (nomP.equals("")) {
            System.out.println("Le nom est indispensable.\nQuel nom souhaitez-vous donner à votre personnage ?");
            nomP = sc.nextLine();
        }
        return nomP;
    }

    //************************ Méthode pour donner une image au personnage ****************************************
    public static String creationImage() {

        String nomImage = sc.nextLine();
        // Condition : Pour forcer à entrer au moins un caractère
        while (nomImage.equals("")) {

            System.out.println("Une image est indispensable.\nQuelle image souhaitez-vous pour votre personnage ?");
            nomImage = sc.nextLine();               
        }
        return nomImage;
    }

    //************************ Méthode pour donner une arme au personnage ****************************************
    public static String creationArme() {

        String nomArme = sc.nextLine();
        // Condition : Pour forcer à entrer au moins un caractère
        while (nomArme.equals("")) {

            System.out.println("Une arme est indispensable");
            nomArme = sc.nextLine();
        }
        return nomArme;
    }

    //************************ Donner un niveau de vie au personnage ****************************************
    public static Integer creationNiveauVie() {

        int nomNiveauVie = sc.nextInt();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 100
        while (nomNiveauVie < 0 || nomNiveauVie > 100) {

            System.out.println("Un niveau de vie entre 0 et 100 est indispensable.\nQuel niveau choisissez-vous ?");
            nomNiveauVie = sc.nextInt();
        }
        return nomNiveauVie;
    }

    //************************ Donner une force d'attaque au personnage ****************************************
    public static Integer creationForceAttaque() {

        int nomForceAttaque = sc.nextInt();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 200
        while (nomForceAttaque < 0 || nomForceAttaque > 200) {

            System.out.println("Une force d'attaque entre 0 et 200 est indispensable.\nQuel force choisissez-vous ?");
            nomForceAttaque = sc.nextInt();
        }
        return nomForceAttaque;
    }
    
    //************************ Donner un bouclier au personnage ****************************************
    public static Integer creationBouclier() {
        
        int nomBouclier = sc.nextInt();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 200
        while (nomBouclier < 0 || nomBouclier > 200) {

            System.out.println("Une force de bouclier entre 0 et 200 est indispensable.\nQuelle force de bouclier choisissez-vous ?");
            nomBouclier = sc.nextInt();
        }
        return nomBouclier;
    } 

}

