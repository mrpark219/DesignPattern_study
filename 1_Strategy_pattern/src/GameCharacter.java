public class GameCharacter {

    private Weapon weapon;

    public void attackMonster() {
        if(weapon == null) {
            System.out.println("맨손 공격");
        }
        else {
            weapon.attack();
        }
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
