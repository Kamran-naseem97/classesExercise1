package Classes;

public class Weapon {
    int damageOutput;
    int price;
    int durability;
    String projectileType;

    public Weapon() {
        super();
    }
    public Weapon( int damageOutput, int price, int durability, String projectileType) {
        super();
        this.damageOutput = damageOutput;
        this.price = price;
        this.durability = durability;
        this.projectileType = projectileType;
    }
    public Weapon(int damageOutput, int price, int durability){
        this(damageOutput, price, durability, "Armor Piercing");
    }

//    public void stats() {
//        System.out.println("Classes.Weapon stats:\n" + "Damage output: "+ damageOutput+ "\n" + "Price: " + price + "\n" + "Durability: " + durability + "\n" + "Projectile type: " + projectileType);
//    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setProjectileType(String projectileType) {
        this.projectileType = projectileType;
    }

    public int getDamageOutput(){
        return damageOutput;
    }
    public int getPrice(){
        return price;
    }
    public int getDurability(){
        return durability;
    }
    public String getProjectileType(){
        return projectileType;
    }

    @Override
    public String toString(){
        return "Classes.Weapon stats:" +
                "Damage output: "+ this.getDamageOutput()+ "\n" +
                "Price: " + this.getPrice() + "\n" +
                "Durability: " + this.getDurability() + "\n" +
                "Projectile type: " + this.getProjectileType();
    }
}
