public class Armour extends EquipmentStats{
    public Armour(int x){
        super((x==1) ? "Chainmail" : (x==2) ? "Regalia" : (x==3) ? "Fleece" :"",
        (x==1) ? 70 : (x==2) ? 105 : (x==3) ? 150:0,
        (x==1) ? 0 : (x==2) ? 0 : (x==3) ?  0 :0,
        (x==1) ? 1 : (x==2) ?  1 : (x==3) ?   2:0,
        (x==1) ? 0 : (x==2) ?  0 : (x==3) ?   1 :0,
        (x==1) ? -1 : (x==2) ?  0 : (x==3) ?  -1 :0);
    }
}
