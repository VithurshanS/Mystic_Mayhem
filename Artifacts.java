public class Artifacts extends EquipmentStats{
    public Artifacts(int x){
        super((x==1) ? "Excalibur" : (x==2) ? "Amulet" : (x==3) ? "Crystel" :"",
        (x==1) ? 150 : (x==2) ? 200 : (x==3) ? 210:0,
        (x==1) ? 2 : (x==2) ? 1 : (x==3) ?  2 :0,
        (x==1) ? 0 : (x==2) ?  -1 : (x==3) ?   1:0,
        (x==1) ? 0 : (x==2) ?  1 : (x==3) ?   -1 :0,
        (x==1) ? 0 : (x==2) ?  1 : (x==3) ?  -1 :0);
    }
}