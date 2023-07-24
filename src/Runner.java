
public class Runner {
    public static void main(String[] args) {
       Weapon w1 = new Weapon();
        w1.setDamageOutput(100);
        w1.setPrice(250);
        w1.setDurability(99);
        w1.setProjectileType("Slug");

        Weapon w2 = new Weapon(200, 250, 150, "Slug");
        Weapon w3 = new Weapon(100, 150, 25, "Buckshot");

        w2.stats();
        w3.stats();
    }
}