public class ChainOfResponsibility2_main {

    public static void main(String[] args) {

        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);

        //첫번째
        armor1.defense(attack);

        System.out.println(attack.getAmount());

        //Point2
        Defense defense = attack1 -> attack1.setAmount(attack1.getAmount() - 50);

        //추가 착용(동적으로 책임 사슬 추가)
        armor2.setNextDefense(defense);

        attack.setAmount(100);
        //두번째
        armor1.defense(attack);

        System.out.println(attack.getAmount());
    }
}