public class Main {
    public static Hero heroes[];


    public static void main(String[] args) {

        Magic magic = new Magic();
        magic.setHealth(200);
        magic.setDamage(20);
        magic.setSuperPower("Magic применил суперспособность Fire boll");

        Medic medic = new Medic();
        medic.setHealth(200);
        medic.setDamage(0);
        medic.setSuperPower("Medic применил суперспособность Hil");

        Warrior warrior = new Warrior();
        warrior.setHealth(250);
        warrior.setDamage(30);
        warrior.setSuperPower("Warrior применил суперспособность CRITICAL DAMAGE");


        heroes = new Hero[]{magic, medic, warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.getSuperPower());
        }
    }
}
