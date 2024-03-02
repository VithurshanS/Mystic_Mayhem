public abstract class EquipmentStats{
    private String name;
    private int price;
    private int attack;
    private int defence;
    private int health;
    private int speed;
    public EquipmentStats(String name,int price,int attack,int defence,int health,int speed){
        this.name=name;
        this.price=price;
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.speed=speed;
    }
    public String getname(){
        return name;
    }
    public int getattack(){
        return attack;
    }
    public int getprice(){
        return price;
    }
    public int getdefence(){
        return defence;
    }
    public int gethealth(){
        return health;
    }
    public int getspeed(){
        return speed;
    }
}


