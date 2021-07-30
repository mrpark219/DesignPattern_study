public class Builder2_main {

    public static void main(String[] args) {

        /*

            메서드 체이닝(Method Chaining)
            어떤 클래스의 메서드가 자기 자신 즉 객체(this)를 반환하게 되면 반환된 그 객체를 통해
            클래스 내에 다른 메서드를 호출할 수 있는 방식이다.
         */

        Computer computer1 = new Computer("256GB", "i7", "8GB");

        Computer computer2 = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("16GB")
                .setStorage("256GB")
                .build();

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
