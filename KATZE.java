public class KATZE implements Audio
{
    int alter;
    int gewicht;
    int jagdbeuteprowoche;
    
    KATZE(int alterNeu, int gewichtNeu, int jagdNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
        jagdbeuteprowoche = jagdNeu;
    }
    
    public String lautGeben() {
        return "Miauuuu";
    }
}
