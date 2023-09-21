public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHeals(1000000);
        boss.setDamage(40000);
        boss.setProtection("Неуязвимость ко всем атакам");
        System.out.println("Heals - " + boss.getHeals() + ": " + "Damage - " + boss.getDamage()
                + ": " + "Protection - " + boss.getProtection());

    }
}