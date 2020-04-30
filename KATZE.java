public class KATZE implements Audio
{
    int alter;
    int gewicht;
    
    KATZE(int alterNeu, int gewichtNeu, int jagdNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public int AlterGeben ()
    {
      return alter;
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
