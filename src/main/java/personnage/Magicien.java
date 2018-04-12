package personnage;

/**
 * The type Magicien.
 */
public class Magicien extends Personnage

{
    
    private String sort;
    private int philtre;

    /**
     * Get tab string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTab() {
        return tab;
    }

    /**
     * Sets tab.
     *
     * @param tab the tab
     */
    public void setTab(String[] tab) {
        this.tab = tab;
    }





//*************   ACCESSEURS *************

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * Gets philtre.
     *
     * @return the philtre
     */
    public int getPhiltre() {
        return philtre;
    }

    //*************   MUTATEURS *************

    /**
     * Sets sort.
     *
     * @param pSort the p sort
     */
    public void setSort(String pSort)
    {
        this.sort = pSort;
    }

    /**
     * Sets philtre.
     *
     * @param pPhiltre the p philtre
     */
    public void setPhiltre(int pPhiltre)
    {
        this.philtre = pPhiltre;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString()
    {
        return super.toString() + "\n5.Sort : " + sort + "\n6.Philtre : " + philtre;
    }

}
