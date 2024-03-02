public class Stats{
    private String name;
    private int price;
    private int attack;
    private int defence;
    private int health;
    private int speed;
    private Armour armour;
    private Artifacts artifact;
    public Stats(String name,int price,int attack,int defence,int health,int speed){
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
    public String getArmourName(){
        if(armour==null){
            return "no armour";
        }else{
            return armour.getname();
        }
    }
    public String getArtifactName(){
        if(artifact==null){
            return "no artifact";
        }else{
            return artifact.getname();
        }
    }
    public void setattack(int attack){
        this.attack=attack;
    }
    public void setdefence(int defence){
        this.defence=defence;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void sethealth(int health){
        this.health=health;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }
    private void newsetarmour(Armour armour){
            this.setprice(this.getprice()+(int)(0.2*armour.getprice()));
            this.setattack(this.getattack()+armour.getattack());
            this.setdefence(this.getdefence()+armour.getdefence());
            this.sethealth(this.gethealth()+armour.gethealth());
            this.setspeed(this.getspeed()+armour.getspeed());
    }
    private void newsetartifact(Artifacts artifact){
        this.setprice(this.getprice()+(int)(0.2*artifact.getprice()));
        this.setattack(this.getattack()+artifact.getattack());
        this.setdefence(this.getdefence()+artifact.getdefence());
        this.sethealth(this.gethealth()+artifact.gethealth());
        this.setspeed(this.getspeed()+artifact.getspeed());
}

    public void setarmour(Armour armour){
        if(this.armour == null){
            newsetarmour(armour);
            this.armour = armour;
        }else{
            this.setprice(this.getprice()-(int)(0.2*this.armour.getprice()));
            this.setattack(this.getattack()-this.armour.getattack());
            this.setdefence(this.getdefence()-this.armour.getdefence());
            this.sethealth(this.gethealth()-this.armour.gethealth());
            this.setspeed(this.getspeed()+this.armour.getspeed());
            this.armour=armour;
            newsetarmour(armour); 
        }
    }

    public void setartifact(Artifacts artifact){
        if(this.artifact == null){
            newsetartifact(artifact);
            this.artifact=artifact;
        }else{
            this.setprice(this.getprice()-(int)(0.2*this.artifact.getprice()));
            this.setattack(this.getattack()-this.artifact.getattack());
            this.setdefence(this.getdefence()-this.artifact.getdefence());
            this.sethealth(this.gethealth()-this.artifact.gethealth());
            this.setspeed(this.getspeed()+this.artifact.getspeed());
            this.artifact=artifact;
            newsetartifact(artifact); 
        }
    }

        
}

