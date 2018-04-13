package personnage;

import java.util.Scanner;

/**
 * The type Saisie.
 */
public class Saisie {

    private static Scanner sc = new Scanner(System.in);

//    public Saisie(String saisie)
//
//        throws ChampVideException
//        {
//            if (saisie.equals(""))
//            throw new ChampVideException();
//        }


        // METHODES POUR TOUS LES PERSONNAGES

    /**
     * Creation nom string.
     *
     * @return the string
     */
//************************ Méthode pour donner un nom au personnage ****************************************
    // Gestion de la non-saisie du champ par lé génération d'une exception qui lui donne un nom par défaut
    public static String creationNom() throws ChampVideException{

        String nomPerso = sc.nextLine();
        {
                while(nomPerso.equals(""))
                {
                    throw new ChampVideException();
                }
        }
        return nomPerso;
    }

    /**
     * Creation image string.
     *
     * @return the string
     */
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

    /**
     * Creation niveau vie integer.
     *
     * @return the integer
     */
//************************ Donner un niveau de vie au personnage ****************************************
    public static Integer creationNiveauVie() {

        int nomNiveauVie = sc.nextInt();
        sc.nextLine();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 100
        while (nomNiveauVie < 0 || nomNiveauVie > 100) {

            System.out.println("Un niveau de vie entre 0 et 100 est indispensable.\nQuel niveau choisissez-vous ?");
            nomNiveauVie = sc.nextInt();
            sc.nextLine();
        }
        return nomNiveauVie;
    }

    /**
     * Creation force attaque integer.
     *
     * @return the integer
     */
//************************ Donner une force d'attaque au personnage ****************************************
    public static Integer creationForceAttaque() {

        int nomForceAttaque = sc.nextInt();
        sc.nextLine();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 200
        while (nomForceAttaque < 0 || nomForceAttaque > 200) {

            System.out.println("Une force d'attaque entre 0 et 200 est indispensable.\nQuel force choisissez-vous ?");
            nomForceAttaque = sc.nextInt();
            sc.nextLine();
        }
        return nomForceAttaque;
    }

// METHODES SPECIALES POUR LES GUERRIERS

    /**
     * Creation arme string.
     *
     * @return the string
     */
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

    /**
     * Creation bouclier integer.
     *
     * @return the integer
     */
//************************ Donner un bouclier au personnage ****************************************
    public static Integer creationBouclier() {

        int nomBouclier = sc.nextInt();
        sc.nextLine();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 200
        while (nomBouclier < 0 || nomBouclier > 200) {

            System.out.println("Une force de bouclier entre 0 et 200 est indispensable.\nQuelle force de bouclier choisissez-vous ?");
            nomBouclier = sc.nextInt();
            sc.nextLine();
        }
        return nomBouclier;
    }

    // METHODES SPECIALES POUR LES MAGICIENS

    /**
     * Creation sort string.
     *
     * @return the string
     */
//************************ Méthode pour donner un sort au personnage ****************************************
    public static String creationSort() {

        String nomSort = sc.nextLine();
        // Condition : Pour forcer à entrer au moins un caractère
        while (nomSort.equals("")) {

            System.out.println("Un sort est indispensable");
            nomSort = sc.nextLine();
        }
        return nomSort;
    }

    /**
     * Creation philtre integer.
     *
     * @return the integer
     */
//************************ Donner un philtre au personnage ****************************************
    public static Integer creationPhiltre() {

        int philtreMage = sc.nextInt();
        sc.nextLine();
        // Condition pour limiter l'entrée à un chiffre entre 0 et 200
        while (philtreMage < 0 || philtreMage > 200) {

            System.out.println("Une force entre 0 et 200 est indispensable pour le philtre.\nQuel force souhaitez-vous pour le philtre de votre magicien ?");
            philtreMage = sc.nextInt();
            sc.nextLine();
        }
        return philtreMage;
    }


}

