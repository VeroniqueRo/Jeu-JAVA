package personnage;

import java.util.Scanner;

public class Saisie {

    private static Scanner sc = new Scanner(System.in);

    // Méthode pour créer le nom du personnage
    public static String creationNom() {
        
        //************************ Donner un nom au personnage ****************************************
        String nomP = sc.nextLine();
        while (nomP.equals("")) {
            System.out.println("Le nom est indispensable.\nQuel nom souhaitez-vous donner à votre guerrier ?");
            nomP = sc.nextLine();
        }
        return nomP;
    }


    public static String creationImage() {
        String nomImage = sc.nextLine();
            // Condition : Pour forcer à entrer au moins un caractère
            while (nomImage.equals("")) {

                System.out.println("Une image est indispensable.\nQuelle image souhaitez-vous pour votre guerrier ?");
                nomImage = sc.nextLine();               
            }
            return nomImage;
        }
}

