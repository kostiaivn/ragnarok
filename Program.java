package Ragnarok;

/**
 * Created by Гриша on 10.10.2015.
 */
public class Program {

    public static void printInfo(String name, int hp, int mp)
    {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(hp);
        System.out.print("/");
        System.out.print(mp);
        System.out.print(")\n");
    }

    public static void main(String[] args) {
        /*
        String giviName = "Givi";
        int giviHP = 100, giviMP = 250;
        String meddiusName = "Meddius";
        int meddiusHP = 150, meddiusMP = 200;
        printInfo(giviName, giviHP, giviMP);
        printInfo(meddiusName, meddiusHP, meddiusMP);
        System.out.println();

        String[] names = new String[2];
        int[] hps = new int[2], mps = new int[2];
        names[0] = "Givi"; names[1] = "Meddius";
        hps[0] = 100; hps[1] = 150;
        mps[0] = 250; mps[1] = 200;
        for(int i = 0; i<2; i++)
            printInfo(names[i], hps[i], mps[i]);
        System.out.println();

        Mage giviMage = new Mage();
        giviMage.Name = "Givi";
        giviMage.HP = 100;
        giviMage.setHP(100);
        giviMage.MP = 250;
        giviMage.setMP(250);
        Mage meddiusMage = new Mage();
        meddiusMage.Name = "Meddius";
        meddiusMage.HP = 150;
        meddiusMage.setHP(150);
        meddiusMage.MP = 200;
        meddiusMage.setMP(200);
        giviMage.Print();
        meddiusMage.Print();*/

        System.out.println("\nLET THE FIGHT BEGIN");
        Mage givi = new Mage("Givi", 1, 96, 92, 30, 30, 1);
        Mage meddius = new Mage("Meddius", 1, 92, 96, 30, 30, 1);
        givi.Print();
        System.out.print(" vs ");
        meddius.Print();
        System.out.println();
        int round = 1;
        while(givi.isAlive() && meddius.isAlive())
        {
            System.out.format("\nROUND %d FIGHT!\n", round++);
            givi.Print();
            System.out.print(" ");
            meddius.Print();
            System.out.println();
            int tempDamage = givi.MagicAtack();
            if (tempDamage == 0)
                tempDamage = givi.MeleeAtack();
            meddius.getDamage(tempDamage);

            tempDamage = meddius.MagicAtack();
            if (tempDamage == 0)
                tempDamage = meddius.MeleeAtack();
            givi.getDamage(tempDamage);
        }
        System.out.println();
        if(meddius.isAlive())
        {
            System.out.format("%s WON THE FIGHT!", meddius.Name);
            meddius = new Wizard(meddius.Name, meddius.Str, meddius.Int, meddius.Dex, meddius.Vit, meddius.Luck, meddius.Agi);
            System.out.println("\n\n\n");
            meddius.Print();
        }
        if(givi.isAlive())
        {
            System.out.format("%s WON THE FIGHT!", givi.Name);
            givi = new Wizard(givi.Name, givi.Str, givi.Int, givi.Dex, givi.Vit, givi.Luck, givi.Agi);
            System.out.println("\n\n\n");
            givi.Print();
        }

    }
}
