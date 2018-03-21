package personnage;

public class Magicien extends Personnage

{
    
    private String sort;
    private int philtre;



//*************   ACCESSEURS *************

    public String getSort() {
        return sort;
    }

    public int getPhiltre() {
        return philtre;
    }

    //*************   MUTATEURS *************

    public void setSort(String pSort)
    {
        this.sort = pSort;
    }

    public void setPhiltre(int pPhiltre)
    {
        this.philtre = pPhiltre;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString()
    {
        return super.toString() + "\nSort : " + sort + "\nPhiltre : " + philtre;
    }

}
