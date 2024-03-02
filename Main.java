import java.util.*;

public class Main {
    static void signup(){
        Scanner input = new Scanner(System.in);
        System.out.print("WELCOME to SIGNUP page \n\nEnter your Name : ");
        String name = input.next();


        System.out.print("\nEnter your UserName : ");
        String username = input.next();


        System.out.print("\nChoose a homeland\n1.Hillcrest\n2.Marshland\n3.Desert\n4.Arcane\nchoose a suitable number : ");
        int homeland = input.nextInt();


        System.out.print("\nBuy Archer\n\n1.Shooter\n2.Ranger\n3.Sunfire\n4.Zing\n5.Saggitarius\nchoose a suitable number : ");
        int archer = input.nextInt();
        Archer arch = new Archer(archer);
        BuyEquipments.buyEquipment(arch);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        
        System.out.print("\nBuy knights\n\n1.Squire\n2.Caviler\n3.Templer\n4.Zoro\n5.Swiftblade\nchoose a suitable number : ");
        int knights = input.nextInt();
        Knights knig = new Knights(knights);
        BuyEquipments.buyEquipment(knig);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        
        System.out.print("\nBuy mages\n\n1.warlock\n2.illutionist\n3.enchantor\n4.conjurer\n5.eldritch\nchoose a suitable number : ");
        int mages = input.nextInt();
        Mages mage = new Mages(mages);
        BuyEquipments.buyEquipment(mage);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        
        System.out.print("\nBuy healers\n\n1.soother\n2.medic\n3.alchemist\n4.saint\n5.lightbringer\nchoose a suitable number : ");
        int healers = input.nextInt();
        Healers heal = new Healers(healers);
        BuyEquipments.buyEquipment(heal);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        
        System.out.print("\nBuy mythcreature\n\n1.dragon\n2.basilisk\n3.hydra\n4.phoenix\n5.pegasus\nchoose a suitable number : ");
        int mythcreature = input.nextInt();
        MythicalCreatures myth = new MythicalCreatures(mythcreature);
        BuyEquipments.buyEquipment(myth);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        
        System.out.println("\n\nSignup Completed.....");
        System.out.println("\nplayer name: "+name+" user name "+username);
        System.out.println("\n  Archer name : "+arch.getname()+" current value : "+arch.getprice()+" Attack : "+arch.getattack()+" Defence : "+arch.getdefence()+" Health : "+arch.gethealth()+" Speed : "+arch.getspeed()+" Equipments : "+arch.getArmourName()+" , "+arch.getArtifactName());
        System.out.println("\n  Knight name : "+knig.getname()+" current value : "+knig.getprice()+" Attack : "+knig.getattack()+" Defence : "+knig.getdefence()+" Health : "+knig.gethealth()+" Speed : "+knig.getspeed()+" Equipments : "+knig.getArmourName()+" , "+knig.getArtifactName());
        System.out.println("\n  Mage name : "+mage.getname()+" current value : "+mage.getprice()+" Attack : "+mage.getattack()+" Defence : "+mage.getdefence()+" Health : "+mage.gethealth()+" Speed : "+mage.getspeed()+" Equipments : "+mage.getArmourName()+" , "+mage.getArtifactName());
        System.out.println("\n  Healer name : "+heal.getname()+" current value : "+heal.getprice()+" Attack : "+heal.getattack()+" Defence : "+heal.getdefence()+" Health : "+heal.gethealth()+" Speed : "+heal.getspeed()+" Equipments : "+heal.getArmourName()+" , "+heal.getArtifactName());
        System.out.println("\n  Mythical Creature name : "+myth.getname()+" current value : "+myth.getprice()+" Attack : "+myth.getattack()+" Defence : "+myth.getdefence()+" Health : "+myth.gethealth()+" Speed : "+myth.getspeed()+" Equipments : "+myth.getArmourName()+" , "+myth.getArtifactName());

        



        input.close();

    }
    public static void main(String[] args){
        signup();
        

    }
    
}
