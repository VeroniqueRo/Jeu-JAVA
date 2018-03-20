package personnage;

import java.util.Scanner;

public class Jeu {
   
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Choisir votre personnage :\n1 pour Guerrier \n2 pour Magicien");
    String str = sc.nextLine();
    
    System.out.println("Vous avez saisi : " + str); 
    //Tableau contenant les personnages, tableau d'objets Personnage
    Personnage personnages[] = new Personnage[10];
    int nbPerso = 0;
         
        if (str.equals("1")) {

            //Création du personnage
            Guerrier guerrier = new Guerrier();
            //Ajout du personnage dans le tableau personnages
            personnages[nbPerso]=guerrier;
            //Incrémente le nombre de personnage dans le tableau
            nbPerso++;

            //************************ Donner un nom au personnage ****************************************
            System.out.println("Donnez-lui un nom ?");
            String nomPerso = sc.nextLine();
            guerrier.setNom(nomPerso); // Attribuer le nom donné par l'utilisateur au Guerrier créé

            //************************ Donner une image au personnage ****************************************
            System.out.println("Quelle image souhaitez-vous ?");
            String nomImage = sc.nextLine();
            guerrier.setImage(nomImage); // Attribuer une image donnée par l'utilisateur au Guerrier créé

            //************************ Donner une arme au personnage ****************************************
            System.out.println("Quelle arme souhaitez-vous lui attribuer ?");
            String nomArme = sc.nextLine();
            guerrier.setArme(nomArme); // Attribuer le nom de l'arme donnée par l'utilisateur au Guerrier créé

            //************************ Donner un niveau de vie au personnage ****************************************
            System.out.println("Quelle niveau de vie souhaitez-vous donner à votre guerrier ?");
            int nomNiveauVie = sc.nextInt();
            guerrier.setNiveauVie(nomNiveauVie);// Attribuer un niveau de vie au nouveau personnage créé

            //************************ Donner une force d'attaque au personnage ****************************************
            System.out.println("Quelle force d'attaque souhaitez-vous donner à votre guerrier ?");
            int nomForceAttaque = sc.nextInt();
            guerrier.setForceAttaque(nomForceAttaque);// Attribuer une force d'attaque au nouveau personnage créé
            
            //************************ Donner un bouclier au personnage ****************************************
            System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
            int nomBouclier = sc.nextInt();
            guerrier.setBouclier(nomBouclier);// Attribuer un bouclier au nouveau personnage créé

            //Afficher les infos du personnage créé
            // System.out.println(guerrier.getBouclier());// Permet de récupérer le
            System.out.println("************************************" + "\nVotre guerrier " + nomPerso + " a été créé" + "\navec les caractéristiques suivantes :" + "\n ");
            System.out.println(guerrier);
            System.out.println("************************************");
        
        }
        
        else if (str.equals("2")) {
            
            //Création du personnage
            Magicien magicien = new Magicien();
            //Ajout du personnage dans le tableau personnages
            personnages[nbPerso]=magicien;
            //Incrémente le nombre de personnage dans le tableau
            nbPerso++;

            //************************ Donner un nom au personnage ****************************************
            System.out.println("Donnez-lui un nom ?");
            String nomPerso = sc.nextLine();
            magicien.setNom(nomPerso); // Attribuer le nom donné par l'utilisateur au magicien créé

            //************************ Donner une image au personnage ****************************************
            System.out.println("Quelle image souhaitez-vous ?");
            String nomImage = sc.nextLine();
            magicien.setImage(nomImage); // Attribuer une image donnée par l'utilisateur au magicien créé

            //************************ Donner une arme au personnage ****************************************
            System.out.println("Quelle sort souhaitez-vous lui attribuer ?");
            String nomSort = sc.nextLine();
            magicien.setSort(nomSort); // Attribuer le nom de l'arme donnée par l'utilisateur au magicien créé

            //************************ Donner un niveau de vie au personnage ****************************************
            System.out.println("Quelle niveau de vie souhaitez-vous donner à votre magicien ?");
            int nomNiveauVie = sc.nextInt();
            magicien.setNiveauVie(nomNiveauVie);// Attribuer un niveau de vie au nouveau personnage créé

            //************************ Donner une force d'attaque au personnage ****************************************
            System.out.println("Quelle force d'attaque souhaitez-vous donner à votre magicien ?");
            int nomForceAttaque = sc.nextInt();
            magicien.setForceAttaque(nomForceAttaque);// Attribuer une force d'attaque au nouveau personnage créé
            
            //************************ Donner un philtre au personnage ****************************************
            System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
            int nomPhiltre = sc.nextInt();
            magicien.setPhiltre(nomPhiltre);// Attribuer un philtre au nouveau personnage créé

            //Afficher les infos du personnage créé
            System.out.println("************************************" + "\nVotre magicien " + nomPerso + " a été créé"+"\navec les caractéristiques suivantes :" + "\n ");
            System.out.println(magicien);
            System.out.println("************************************");
        
        }
    
    }
}