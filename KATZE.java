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
    public void AlterSetzen(int alterNeu)
    {
     alter = alterNeu;   
    }
    public int GewichtGeben ()
    {
      return gewicht;   
    }
    
    public String lautGeben() {
        return "Miauuuu";
    }
}
