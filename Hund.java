public class Hund implements Audio
{
    int alter;
    int gewicht;
    
    Hund(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    public int GewichtGeben()
    {
        return gewicht;
    }
    
    public int AlterGeben()
    {
        return alter;
    }
    

    public boolean sollteGestorbenSein() {
        return alter > 30;
    }

    public String lautGeben() {
        return "Wuff";
    }
}
