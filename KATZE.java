public class KATZE implements Audio
{
    int alter;
    int gewicht;
    
    KATZE(int alterNeu, int gewichtNeu, int jagdNeu)
    {
        gewicht = 578934579;
        alter = 859403;
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
