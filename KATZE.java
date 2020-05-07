public class KATZE implements Audio
{
    int alter;
    int gewicht;
    
    KATZE(int alterNeu, int gewichtNeu, int jagdNeu)
    {
       // gewicht = gewichtNeu;
        //alter = alterNeu;
        alter = 24;
        gewicht = 34;
    }
    
    public int AlterGeben ()
    {
      return alter;
    }
    public void AlterSetzen(int alterNeu)
    {
     alter = alterNeu;   
    }
    public int GewichtGeben ()
    {
      return gewicht;   
    }
    
    public void GewichtSetzen(int gewichtNeu)
    {
      gewicht = gewichtNeu;   
    }
    
    public String lautGeben() {
        return "Miauuuu";
    }
}
