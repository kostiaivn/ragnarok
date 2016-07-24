package Ragnarok;

import java.lang.*;

/**
 * Created by Гриша on 10.10.2015.
 */
public class Wizard extends Mage implements Character {



    public Wizard(String Name, int Str, int Int, int Dex, int Vit, int Luck, int Agi)
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
        if (MP > 30)
        {
            MP = MP - 30;
            return (Int*6+Dex*3+Luck);
        }else
            return 0;
    }
}
