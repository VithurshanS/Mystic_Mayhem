public class MythicalCreatures extends Stats{
    public MythicalCreatures(int x){
        super((x==1) ? "Dragon" : (x==2) ? "Basilisk" : (x==3) ? "Hydra" : (x==4) ? "Phoenix" : (x==5) ? "Pegasus":"",
        (x==1) ? 120 : (x==2) ? 165 : (x==3) ? 205 : (x==4) ? 275 : (x==5) ? 340:0,
        (x==1) ? 12 : (x==2) ? 15 : (x==3) ? 12 : (x==4) ? 17 : (x==5) ? 14:0,
        (x==1) ? 14 : (x==2) ? 11 : (x==3) ? 16: (x==4) ? 13 : (x==5) ? 18:0,
        (x==1) ? 15 : (x==2) ? 10 : (x==3) ? 15 : (x==4) ? 17 : (x==5) ? 20:0,
        (x==1) ? 8 : (x==2) ? 12 : (x==3) ? 11 : (x==4) ? 19 : (x==5) ? 20:0);
    }
}