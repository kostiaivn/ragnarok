package Ragnarok;

import java.util.Random;

/**
 * Created by Гриша on 10.10.2015.
 */
public class Mage {
    public String Name;
    protected int HP;
    protected int MP;
    public int Str;
    public int Int;
    public int Dex;
    public int Vit;
    public int Luck;
    public int Agi;

    public Mage() {

    }

    public Mage(String Name, int HP, int MP) {
        this.Name = Name;
        this.HP = HP;
        this.MP = MP;
    }

    public Mage(String Name, int Str, int Int, int Dex, int Vit, int Luck, int Agi) {
        this.Name = Name;
        this.Str = Str;
        this.Int = Int;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Luck = Luck;
        this.Agi = Agi;
        this.HP = 100+(2*Vit+1)*(Luck+1);
        this.MP = 200+(2*Int+1)*(Dex+1);
    }

    public void Print() {
        /*
        System.out.print(Name);
        System.out.print(" (");
        System.out.print(HP);
        System.out.print("/");
        System.out.print(MP);
        System.out.print(")\n");*/
        System.out.format("%s (%d/%d)", Name, HP, MP);
    }

    public int MeleeAtack()
    {
        MP = MP + 5;
        return (Str*2+Dex+Agi+Luck);
    }

    public int MagicAtack()
    {
        if (MP > 10)
        {
            MP = MP - 10;
            return (Int*3+Dex*2+Luck);
        }else
            return 0;
    }

    public void getDamage(int damage)
    {
        Random r = new Random();
        int gotDamage = damage - (Vit/2);
        System.out.format("%s blocked %d damage and got %d damage. ", Name, Vit/2, gotDamage);
        if(gotDamage > 0)
        {
            if (r.nextInt(100)>Luck)
                HP = HP - gotDamage;
            else
                System.out.print("FLEE!");
        }
        System.out.println();
    }

    public boolean isAlive()
    {
        if (HP <=0)
            return false;
        else
            return true;
    }

    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public int getHP()
    {
        return HP;
    }

    public void setMP(int MP)
    {
        this.MP = MP;
    }
}
