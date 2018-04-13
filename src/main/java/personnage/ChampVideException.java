package personnage;

public class ChampVideException extends Exception {

    public ChampVideException() {
        System.out.println("Le champs ne peut être vide ! \nUn nom vous est donné par défaut");
    }
}
