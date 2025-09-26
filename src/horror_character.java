abstract class horror_character
{
    String name;
    int health;
    Vulnerability[] vulnerabilities;

    /**
     * initialized the variables
     * @param health a integer value for how much health the character has
     * @param name a string for the horror character
     */
    public horror_character(int health, String name)
    {
        this.health = health;
        this.name = name;

    }
    /**
     * a void method meant to be given and overridden by the child classes
     */
    public void attack()
    {

    }
    /**
     * a void method meant to be given and overridden by the child classes
     */
    public void flee()
    {

    }




}
