public class Hund implements Audio
{
    int alter;
    int gewicht;
    
    Hund(int alterNeu, int gewichtNeu)
    {
        //gewicht = gewichtNeu;
        //alter = alterNeu;
        gewicht = 1;
        alter = 12;
    }
    public void GewichtSetzen(int gewichtNeu)
    {
      gewicht = gewichtNeu;
    }
    public int GewichtGeben()
    {
        return gewicht;
    }
    
    public int AlterGeben()
    {
        return alter;
    }
    
    public void AlterSetzen (int alterNeu)
    {
         alter = alterNeu;
    }

    public boolean sollteGestorbenSein() {
        return alter > 30;
    }

    public String lautGeben() {
        return "Wuff";
    }
}
