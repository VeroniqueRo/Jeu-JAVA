package personnage;

import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir votre personnage :\n1 pour Guerrier \n2 pour Magicien");
        String str = sc.nextLine();
        // System.out.println("Vous avez saisi : " + str); 

        // Permet d'afficher le nom du personnage choisi
        if (str.equals("1")) {
            System.out.println("Vous avez choisi de créer un guerrier");
        }

        if (str.equals("2")) {
            System.out.println("Vous avez choisi de créer un magicien");
        }



        //Tableau contenant les personnages, tableau d'objets Personnage
        Personnage personnages[] = new Personnage[10];
        int nbPerso = 0;

            if (str.equals("1")) {

                //Création du personnage
                Guerrier guerrier = new Guerrier();
                //Ajout du personnage dans le tableau personnages
                personnages[nbPerso] = guerrier;
                //Incrémente le nombre de personnage dans le tableau
                nbPerso++;

                //************************ Donner un nom au personnage ****************************************
                System.out.println("Donnez-lui un nom ?");
                String nomPerso = sc.nextLine();
                guerrier.setNom(nomPerso); // Attribuer le nom donné par l'utilisateur au Guerrier créée

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (nomPerso.equals("")) {

                        System.out.println("Le nom est indispensable."+"\nQuel nom souhaitez-vous donner à votre guerrier ?");
                        nomPerso = sc.nextLine();
                        guerrier.setNom(nomPerso);
                    }

                //************************ Donner une image au personnage ****************************************
                System.out.println("Quelle image souhaitez-vous ?");
                String nomImage = sc.nextLine();
                guerrier.setImage(nomImage); // Attribuer une image donnée par l'utilisateur au Guerrier créé

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (nomImage.equals("")) {

                        System.out.println("Une image est indispensable"+"\nQuelle image souhaitez-vous pour votre guerrier ?");
                        nomImage = sc.nextLine();
                        guerrier.setImage(nomImage);
                    }

                //************************ Donner une arme au personnage ****************************************
                System.out.println("Quelle arme souhaitez-vous lui attribuer ?");
                String nomArme = sc.nextLine();
                guerrier.setArme(nomArme); // Attribuer le nom de l'arme donnée par l'utilisateur au Guerrier créé

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (nomArme.equals("")) {

                        System.out.println("Une arme est indispensable");
                        nomArme = sc.nextLine();
                        guerrier.setArme(nomArme);
                    }

                //************************ Donner un niveau de vie au personnage ****************************************
                System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre guerrier ?");
                int nomNiveauVie = sc.nextInt();
                guerrier.setNiveauVie(nomNiveauVie); // Attribuer un niveau de vie au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 100
                    while (nomNiveauVie < 0 || nomNiveauVie > 100) {

                        System.out.println("Un niveau de vie entre 0 et 100 est indispensable"+"\nQuel niveau choisissez-vous ?");
                        nomNiveauVie = sc.nextInt();
                        guerrier.setNiveauVie(nomNiveauVie);
                    }

                //************************ Donner une force d'attaque au personnage ****************************************
                System.out.println("Quelle force d'attaque souhaitez-vous donner à votre guerrier ?");
                int nomForceAttaque = sc.nextInt();
                guerrier.setForceAttaque(nomForceAttaque); // Attribuer une force d'attaque au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 200
                    while (nomForceAttaque < 0 || nomForceAttaque > 200) {

                        System.out.println("Une force d'attaque entre 0 et 200 est indispensable"+"\nQuel force choisissez-vous ?");
                        nomForceAttaque = sc.nextInt();
                        guerrier.setForceAttaque(nomForceAttaque);
                    }

                //************************ Donner un bouclier au personnage ****************************************
                System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
                int nomBouclier = sc.nextInt();
                guerrier.setBouclier(nomBouclier); // Attribuer un bouclier au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 200
                    while (nomBouclier < 0 || nomBouclier > 200) {

                        System.out.println("Une force de bouclier entre 0 et 200 est indispensable"+"\nQuel force de bouclier choisissez-vous ?");
                        nomBouclier = sc.nextInt();
                        guerrier.setBouclier(nomBouclier);
                    }

                //Afficher les infos du personnage créé
                // System.out.println(guerrier.getBouclier());// Permet de récupérer le
                System.out.println("************************************" + "\nVotre guerrier " + nomPerso + " a été créé" + "\navec les caractéristiques suivantes :" + "\n ");
                System.out.println(guerrier);
                System.out.println("************************************");

            }

            if (str.equals("2")) {

                //Création du personnage
                Magicien magicien = new Magicien();
                //Ajout du personnage dans le tableau personnages
                personnages[nbPerso] = magicien;
                //Incrémente le nombre de personnage dans le tableau
                nbPerso++;

                //************************ Donner un nom au personnage ****************************************
                System.out.println("Donnez-lui un nom ?");
                String nomMage = sc.nextLine();
                magicien.setNom(nomMage); // Attribuer le nom donné par l'utilisateur au magicien créé

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (nomMage.equals("")) {

                        System.out.println("Le nom est indispensable."+"\nQuel nom souhaitez-vous donner à votre magicien ?");
                        nomMage = sc.nextLine();
                        magicien.setNom(nomMage);
                    }

                //************************ Donner une image au personnage ****************************************
                System.out.println("Quelle image souhaitez-vous ?");
                String imageMage = sc.nextLine();
                magicien.setImage(imageMage); // Attribuer une image donnée par l'utilisateur au magicien créé

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (imageMage.equals("")) {

                        System.out.println("Une image est indispensable."+"\nQuelle image souhaitez-vous pour votre magicien ?");
                        imageMage = sc.nextLine();
                        magicien.setImage(imageMage);
                    }

                //************************ Donner une arme au personnage ****************************************
                System.out.println("Quelle sort souhaitez-vous lui attribuer ?");
                String sortMage = sc.nextLine();
                magicien.setSort(sortMage); // Attribuer le nom de l'arme donnée par l'utilisateur au magicien créé

                    // Condition : Pour forcer à entrer au moins un caractère
                    while (sortMage.equals("")) {

                        System.out.println("Un sort est indispensable."+"\nQuel sort souhaitez-vous pour votre magicien ?");
                        sortMage = sc.nextLine();
                        magicien.setSort(sortMage);
                    }

                //************************ Donner un niveau de vie au personnage ****************************************
                System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre magicien ?");
                int niveauVieMage = sc.nextInt();
                magicien.setNiveauVie(niveauVieMage); // Attribuer un niveau de vie au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 100
                    while (niveauVieMage < 0 || niveauVieMage > 100) {

                        System.out.println("Un niveau de vie entre 0 et 100 est indispensable."+"\nQuel niveau de vie souhaitez-vous pour votre magicien ?");
                        niveauVieMage = sc.nextInt();
                        magicien.setNiveauVie(niveauVieMage);
                    }

                //************************ Donner une force d'attaque au personnage ****************************************
                System.out.println("Quelle force d'attaque (entre 0 et 200) souhaitez-vous donner à votre magicien ?");
                int forceAttaqueMage = sc.nextInt();
                magicien.setForceAttaque(forceAttaqueMage); // Attribuer une force d'attaque au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 200
                    while (forceAttaqueMage < 0 || forceAttaqueMage > 100) {

                        System.out.println("Une force d'attaque entre 0 et 200 est indispensable."+"\nQuel force d'attaque souhaitez-vous pour votre magicien ?");
                        forceAttaqueMage = sc.nextInt();
                        magicien.setForceAttaque(forceAttaqueMage);
                    }

                //************************ Donner un philtre au personnage ****************************************
                System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
                int philtreMage = sc.nextInt();
                magicien.setPhiltre(philtreMage); // Attribuer un philtre au nouveau personnage créé

                    // Condition pour limiter l'entrée à un chiffre entre 0 et 200
                    while (philtreMage < 0 || philtreMage > 200) {

                        System.out.println("Une force entre 0 et 200 est indispensable pour le philtre."+"\nQuel force souhaitez-vous pour le philtre de votre magicien ?");
                        philtreMage = sc.nextInt();
                        magicien.setPhiltre(philtreMage);
                    }

                //Afficher les infos du personnage créé
                System.out.println("************************************" + "\nVotre magicien " + nomMage + " a été créé" + "\navec les caractéristiques suivantes :" + "\n ");
                System.out.println(magicien);
                System.out.println("************************************");

            }
        }
    
}