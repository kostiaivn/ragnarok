package Ragnarok;

/**
 * Created by Гриша on 10.10.2015.
 */
public class Sage extends Mage{
    public Sage(String Name, int Str, int Int, int Dex, int Vit, int Luck, int Agi)
    {
        this.Name = Name;
        this.Str = Str;
        this.Int = Int;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Luck = Luck;
        this.Agi = Agi;
        this.HP = 200+(2*Vit+1)*(2*Luck+1);
        this.MP = 300+(3*Int+1)*(2*Dex+1);
    }
    public int MagicAtack()
    {
        if (MP > 20)
        {
            MP = MP - 20;
            return (Int*5+Dex*10+Luck);
        }else
            return 0;
    }
}
