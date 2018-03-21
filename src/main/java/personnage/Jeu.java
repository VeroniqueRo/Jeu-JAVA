package personnage;

import java.util.Scanner;

public class Jeu {

    private static Scanner sc ;
    private static Personnage personnages[] = new Personnage[10]; //Tableau contenant les personnages, tableau d'objets Personnage
    private static int nbPerso = 0;

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le jeu !");        
        sc = new Scanner(System.in);
        System.out.println("Choisir votre personnage :\n1 pour Guerrier \n2 pour Magicien");
        String str = sc.nextLine();
        // System.out.println("Vous avez saisi : " + str); 

        // Permet d'afficher le nom du personnage choisi
        if (str.equals("1")) {
            System.out.println("Vous avez choisi de créer un guerrier");
            CreateWarrior();
        }

        if (str.equals("2")) {
            System.out.println("Vous avez choisi de créer un magicien");
            CreateMagic();
        }
    }

     //Methode pour créer un guerrier
     public static void CreateMagic()
     {
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

                  System.out.println("Le nom est indispensable.\nQuel nom souhaitez-vous donner à votre magicien ?");
                  nomMage = sc.nextLine();
                  magicien.setNom(nomMage);
              }

          //************************ Donner une image au personnage ****************************************
          System.out.println("Quelle image souhaitez-vous ?");
          String imageMage = sc.nextLine();
          magicien.setImage(imageMage); // Attribuer une image donnée par l'utilisateur au magicien créé

              // Condition : Pour forcer à entrer au moins un caractère
              while (imageMage.equals("")) {

                  System.out.println("Une image est indispensable.\nQuelle image souhaitez-vous pour votre magicien ?");
                  imageMage = sc.nextLine();
                  magicien.setImage(imageMage);
              }

          //************************ Donner une arme au personnage ****************************************
          System.out.println("Quelle sort souhaitez-vous lui attribuer ?");
          String sortMage = sc.nextLine();
          magicien.setSort(sortMage); // Attribuer le nom de l'arme donnée par l'utilisateur au magicien créé

              // Condition : Pour forcer à entrer au moins un caractère
              while (sortMage.equals("")) {

                  System.out.println("Un sort est indispensable.\nQuel sort souhaitez-vous pour votre magicien ?");
                  sortMage = sc.nextLine();
                  magicien.setSort(sortMage);
              }

          //************************ Donner un niveau de vie au personnage ****************************************
          System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre magicien ?");
          int niveauVieMage = sc.nextInt();
          magicien.setNiveauVie(niveauVieMage); // Attribuer un niveau de vie au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 100
              while (niveauVieMage < 0 || niveauVieMage > 100) {

                  System.out.println("Un niveau de vie entre 0 et 100 est indispensable.\nQuel niveau de vie souhaitez-vous pour votre magicien ?");
                  niveauVieMage = sc.nextInt();
                  magicien.setNiveauVie(niveauVieMage);
              }

          //************************ Donner une force d'attaque au personnage ****************************************
          System.out.println("Quelle force d'attaque (entre 0 et 200) souhaitez-vous donner à votre magicien ?");
          int forceAttaqueMage = sc.nextInt();
          magicien.setForceAttaque(forceAttaqueMage); // Attribuer une force d'attaque au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 200
              while (forceAttaqueMage < 0 || forceAttaqueMage > 100) {

                  System.out.println("Une force d'attaque entre 0 et 200 est indispensable.\nQuel force d'attaque souhaitez-vous pour votre magicien ?");
                  forceAttaqueMage = sc.nextInt();
                  magicien.setForceAttaque(forceAttaqueMage);
              }

          //************************ Donner un philtre au personnage ****************************************
          System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
          int philtreMage = sc.nextInt();
          magicien.setPhiltre(philtreMage); // Attribuer un philtre au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 200
              while (philtreMage < 0 || philtreMage > 200) {

                  System.out.println("Une force entre 0 et 200 est indispensable pour le philtre.\nQuel force souhaitez-vous pour le philtre de votre magicien ?");
                  philtreMage = sc.nextInt();
                  magicien.setPhiltre(philtreMage);
              }

          //Afficher les infos du personnage créé
          System.out.println("************************************\n Votre magicien " + nomMage + " a été créé \navec les caractéristiques suivantes :  \n ");
          System.out.println(magicien);
          System.out.println("************************************");
     }
     
     
    //Methode pour créer un guerrier
    public static void CreateWarrior()
    {
          //Création du personnage
          Guerrier guerrier1 = new Guerrier();
          //Ajout du personnage dans le tableau personnages
          personnages[nbPerso] = guerrier1;
          //Incrémente le nombre de personnage dans le tableau
          nbPerso++;
          // guerrier1.creation();
          //************************ Donner un nom au personnage ****************************************
          System.out.println("Donnez-lui un nom ?");
          guerrier1.setNom(Saisie.creationNom()); // Attribuer le nom donné par l'utilisateur au Guerrier créée

          //************************ Donner une image au personnage ****************************************
          System.out.println("Quelle image souhaitez-vous ?");
          guerrier1.setImage(Saisie.creationImage());// Attribuer une image donnée par l'utilisateur au Guerrier créé

          //************************ Donner une arme au personnage ****************************************
          System.out.println("Quelle arme souhaitez-vous lui attribuer ?");
          String nomArme = sc.nextLine();
          guerrier1.setArme(nomArme); // Attribuer le nom de l'arme donnée par l'utilisateur au Guerrier créé

              // Condition : Pour forcer à entrer au moins un caractère
              while (nomArme.equals("")) {

                  System.out.println("Une arme est indispensable");
                  nomArme = sc.nextLine();
                  guerrier1.setArme(nomArme);
              }

          //************************ Donner un niveau de vie au personnage ****************************************
          System.out.println("Quelle niveau de vie (entre 0 et 100) souhaitez-vous donner à votre guerrier ?");
          int nomNiveauVie = sc.nextInt();
          guerrier1.setNiveauVie(nomNiveauVie); // Attribuer un niveau de vie au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 100
              while (nomNiveauVie < 0 || nomNiveauVie > 100) {

                  System.out.println("Un niveau de vie entre 0 et 100 est indispensable.\nQuel niveau choisissez-vous ?");
                  nomNiveauVie = sc.nextInt();
                  guerrier1.setNiveauVie(nomNiveauVie);
              }

          //************************ Donner une force d'attaque au personnage ****************************************
          System.out.println("Quelle force d'attaque souhaitez-vous donner à votre guerrier ?");
          int nomForceAttaque = sc.nextInt();
          guerrier1.setForceAttaque(nomForceAttaque); // Attribuer une force d'attaque au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 200
              while (nomForceAttaque < 0 || nomForceAttaque > 200) {

                  System.out.println("Une force d'attaque entre 0 et 200 est indispensable.\nQuel force choisissez-vous ?");
                  nomForceAttaque = sc.nextInt();
                  guerrier1.setForceAttaque(nomForceAttaque);
              }

          //************************ Donner un bouclier au personnage ****************************************
          System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
          int nomBouclier = sc.nextInt();
          guerrier1.setBouclier(nomBouclier); // Attribuer un bouclier au nouveau personnage créé

              // Condition pour limiter l'entrée à un chiffre entre 0 et 200
              while (nomBouclier < 0 || nomBouclier > 200) {

                  System.out.println("Une force de bouclier entre 0 et 200 est indispensable.\nQuelle force de bouclier choisissez-vous ?");
                  nomBouclier = sc.nextInt();
                  guerrier1.setBouclier(nomBouclier);
              }

          //Afficher les infos du personnage créé
          System.out.println(guerrier1.getBouclier());// Permet de récupérer le nom du bouclier
          //System.out.println("************************************\nVotre guerrier " + nomPerso + " a été créé\navec les caractéristiques suivantes: \n ");
          System.out.println("Votre guerrier est créé");
          System.out.println(guerrier1.toString());
          System.out.println("************************************");

    }

    
}