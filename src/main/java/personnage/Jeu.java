package personnage;

import java.util.Scanner;

public class Jeu {

    private static Scanner sc;
    private static Personnage personnages[] = new Personnage[10]; //Tableau contenant les personnages, tableau d'objets Personnage
    private static int nbPerso = 0;

    public static void main(String[] args) {
        Boolean reponse = true;
        int i = 0;
        String choixPerso;

        System.out.println("Bienvenue dans le jeu !");
        sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Que voulez-vous faire ? ");
            System.out.println("1. Créer un personnage ? ");
            System.out.println("2. Afficher tous les personnages");
            System.out.println("3. Modifier un personnages");
            System.out.println("4. Quitter");

            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    createPerso();
                    break;

                case 2:
                    affichePersos();
                    break;

                case 3:
                    modifPersos();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Erreur de saisie");
            }
            System.out.println("A bientôt !");

        } while (choix != 4);


    }

    // METHODES
    // Affichage du tableau des personnages
    public static void affichePersos()
    {
        for (int i = 0; i < nbPerso; i++)
        {
            System.out.println(personnages[i]);
        }
    }

    // Création des personnages
    public static void createPerso()
    {
        String choixPerso;
        System.out.println("Quel personnage souhaitez-vous creér :\n1 pour Guerrier \n2 pour Magicien");
        choixPerso = sc.nextLine();

        if (choixPerso.equals("1")) {
            System.out.println("Vous avez choisi de créer un guerrier");
            createWarrior();
        }

        if (choixPerso.equals("2")) {
            System.out.println("Vous avez choisi de créer un magicien");
            createMagic();
        }
    }

    // Modification des personnages
    public static void modifPersos(){

        int choixModif;
        String newNom;

        System.out.println("Quel personnage souhaitez-vous modifier ?");
        for (int i = 0; i < nbPerso; i++)
        {
            System.out.println("\n" + i + ". "+ personnages[i].getNom());
        }
        choixModif = sc.nextInt();
        sc.nextLine();
        System.out.println(personnages[choixModif]);
        System.out.println("Nouveau nom pour : "+ personnages[choixModif].getNom());
        newNom = sc.nextLine();
        personnages[choixModif].setNom(newNom);
        System.out.println("Nouveau nom "+ personnages[choixModif].getNom());

    }

    //Méthode pour demander de choisir une valeur à l'attribut et la retourne
    public static String selectAttribut (String message){
        System.out.println(message);
        return sc.nextLine();
    }

    // Methode pour créer un guerrier
    public static void createWarrior() {
        //Création du personnage
        Guerrier guerrier1 = new Guerrier();
        //Ajout du personnage dans le tableau personnages
        personnages[nbPerso] = guerrier1;
        //Incrémente le nombre de personnage dans le tableau
        nbPerso++;
        //************************ Donner un nom au personnage ****************************************
        System.out.println("Donnez-lui un nom ?");
        guerrier1.setNom(Saisie.creationNom()); // Appelle la méthode dans la classe Saisie pour attribuer le nom donné par l'utilisateur au Guerrier créée
        //************************ Donner une image au personnage ****************************************
        System.out.println("Quelle image souhaitez-vous ?");
        guerrier1.setImage(Saisie.creationImage());// Appelle la méthode dans la classe Saisie pour attribuer une image donnée par l'utilisateur au Guerrier créé
        //************************ Donner une arme au personnage ****************************************
        System.out.println("Quelle arme souhaitez-vous lui attribuer ?");
        guerrier1.setArme(Saisie.creationArme()); // Appelle la méthode dans la classe Saisie pour attribuer une arme donnée par l'utilisateur au Guerrier créé
        //************************ Donner un niveau de vie au personnage ****************************************
        System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre guerrier ?");
        guerrier1.setNiveauVie(Saisie.creationNiveauVie()); // Appelle la méthode dans la classe Saisie pour attribuer un niveau de vie au nouveau personnage créé
        //************************ Donner une force d'attaque au personnage ****************************************
        System.out.println("Quelle force d'attaque souhaitez-vous donner à votre guerrier ?");
        guerrier1.setForceAttaque(Saisie.creationForceAttaque()); // Appelle la méthode dans la classe Saisie pour attribuer une force d'attaque au nouveau personnage créé
        //************************ Donner un bouclier au personnage ****************************************
        System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
        guerrier1.setBouclier(Saisie.creationBouclier()); // Appelle la méthode dans la classe Saisie pour attribuer un bouclier au nouveau personnage créé
        //Affiche le nom du personnage créé avec le message "personnage créé"
        System.out.println("***********************************************");
        System.out.println("Votre guerrier " + guerrier1.getNom() + " est créé");
        System.out.println("***********************************************");
    }

    //Methode pour créer un magicien
    public static void createMagic() {
        //Création du personnage
        Magicien magicien1 = new Magicien();
        //Ajout du personnage dans le tableau personnages
        personnages[nbPerso] = magicien1;
        //Incrémente le nombre de personnage dans le tableau
        nbPerso++;
        //************************ Donner un nom au personnage ****************************************
        System.out.println("Donnez-lui un nom ?");
        magicien1.setNom(Saisie.creationNom()); // Attribuer le nom donné par l'utilisateur au magicien créé
        //************************ Donner une image au personnage ****************************************
        System.out.println("Quelle image souhaitez-vous ?");
        magicien1.setImage(Saisie.creationImage()); // Attribuer une image donnée par l'utilisateur au magicien créé
        //************************ Donner une arme au personnage ****************************************
        System.out.println("Quelle sort souhaitez-vous lui attribuer ?");
        magicien1.setSort(Saisie.creationSort()); // Attribuer le nom de l'arme donnée par l'utilisateur au magicien créé
        //************************ Donner un niveau de vie au personnage ****************************************
        System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre magicien ?");
        magicien1.setNiveauVie(Saisie.creationNiveauVie()); // Attribuer un niveau de vie au nouveau personnage créé
        //************************ Donner une force d'attaque au personnage ****************************************
        System.out.println("Quelle force d'attaque (entre 0 et 200) souhaitez-vous donner à votre magicien ?");
        magicien1.setForceAttaque(Saisie.creationForceAttaque()); // Attribuer une force d'attaque au nouveau personnage créé
        //************************ Donner un philtre au personnage ****************************************
        System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
        magicien1.setPhiltre(Saisie.creationPhiltre()); // Attribuer un philtre au nouveau personnage créé
        //Affiche le nom du personnage créé avec le message "personnage créé"
        System.out.println("***********************************************");
        System.out.println("Votre magicien " + magicien1.getNom() + " est créé");
        System.out.println("***********************************************");
    }

}