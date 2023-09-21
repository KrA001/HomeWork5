public class Hero {
 private int heals;
 private int damage;
 private String superAbility;
 public Hero(int heals, int damage, String superAbility){
     this.heals = heals;
     this.damage = damage;
     this.superAbility = superAbility;
 }

     public Hero(int heals, int damage){
         this.heals = heals;
         this.damage = damage;
 }

    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
