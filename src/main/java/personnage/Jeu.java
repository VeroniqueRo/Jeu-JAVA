package personnage;

import java.util.Scanner;

public class Jeu {
   
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Choisir votre personnage : 1.Guerrier ou 2.Magicien ?");
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
        
        //************************Donner un nom au personnage****************************************
        System.out.println("Donnez-lui un nom ?");
        String nomPerso = sc.nextLine();
        guerrier.setNom(nomPerso); //attribuer le nom donné par l'utilisateur au Guerrier créé
        
        //************************Donner une arme au personnage****************************************
        System.out.println("Quel arme souhaitez-vous lui donner ?");
        String nomArme = sc.nextLine();
        guerrier.setArme(nomArme); //attribuer le nom de l'arme donné par l'utilisateur au Guerrier créé
        
        //************************Donner un bouclier au personnage****************************************

        //Afficher les infos du personnage créé
        System.out.println(guerrier);
    
    }

    // Guerrier guerrier = new Guerrier("Warrior", "sonImage", 50, 40, "Arc", 5);
    
    }
}