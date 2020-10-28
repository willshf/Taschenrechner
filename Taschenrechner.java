
/**
 * Beschreiben Sie hier die Klasse Taschenrechner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Taschenrechner
{
    private double speicher;
    private double Laufzeit;
    private double pG=0;
    private double pH=0;
    
    public double addiere(double summand)
    {
        speicher=speicher+summand;
        return speicher;
    }
    
    public double subtrahiere(double subtrahend)
    {
        speicher=speicher-subtrahend;
        return speicher;
    }
    
    public double multipliziere(double faktor)
    {
        speicher=speicher*faktor;
        return speicher;
    }
    
    public double dividiere(double divident)
    {
        speicher=speicher/divident;
        return speicher;
    }
    
    public double speicherAnzeigen()
    {
        return speicher;
    }
    
    public void speicherLoeschen()
    {
        speicher = 0;
    }
    
    public void Kontostand()
    {
        System.out.println("Dein Kontostand beträgt:"+speicher+"€");
    }
    
    public double Zinsenrechnen(double laufzeit, double zinsrate,double guthaben)
    {
        for(int i=1;i<=laufzeit;i++)
        {
           guthaben=guthaben+guthaben*zinsrate;
           System.out.println("Ihr Kontostand beträgt:"+guthaben+"€");
        }
        return guthaben;
    }
    
    public double punkteGast()
    {
        pG=pG+1;
        if(pG==10)
        {
            System.out.println("Das Gastteam hat gewonnen!");
        }
        return pG;
    }
    
    public double punkteHeim()
    {
        pH=pH+1;
        if(pH==10)
        {
            System.out.println("Das Heimteam hat gewonnen!");
        }
        return pH;
    }
    
    public void punkteAusgeben()
    {
        System.out.print("Heim:"+pH+"Gast:"+pG);
        if(pG>pH)
        {
            System.out.print("Das Gastteam führt.");
        }
        else
        {
            System.out.print("Das Heimteam führt");
        }
    }
}
