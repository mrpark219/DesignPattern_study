public class Strategy_main {

    public static void main(String[] args) {

        /*
            Strategy Patten(전략 패턴)
            객체들이 할 수 있는 행위 각각에 대해 전략 클래스를 생성하고, 유사한 행위들을 캡슐화 하는 인터페이스를
            정의하여, 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고 전략을 바꿔주기만 함으로써
            행위를 유연하게 확장하는 방법이다.
         */


        GameCharacter character1 = new GameCharacter();

        character1.attackMonster();
        character1.changeWeapon(new Gun());
        character1.attackMonster();
        character1.changeWeapon(new Sword());
        character1.attackMonster();
    }
}
