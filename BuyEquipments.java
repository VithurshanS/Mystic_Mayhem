import java.util.Scanner;

public class BuyEquipments {
    static void buyEquipment(Stats obj){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t\t\tDo you want to buy Equipment for "+obj.getname()+"\n1.Yes\n2.No\nchoose option : ");
        int yn = input.nextInt();
        if(yn==1){
            System.out.print("\n1.Buy Armour for \n2.Buy Artifacts for "+obj.getname()+"\nchoose option: ");
            int ar = input.nextInt();
            if(ar==1){
                System.out.print("\nBuy armour\n1.Chainmail\n2.Regalia\n3.Fleece\nChoose correct option : ");
                int armour = input.nextInt();
                Armour arm = new Armour(armour);
                obj.setarmour(arm);
                return;

            }else if(ar==2){
                System.out.print("\nBuy artifact\n1.Excalibour\n2.Amulet\n3.Crystal\nChoose correct option : ");
                int artifact = input.nextInt();
                Artifacts art = new Artifacts(artifact);
                obj.setartifact(art);
                return;
            }else{
                return;
            }

        }else{
            return ;
        }

    }
    
}
