import java.util.PriorityQueue;

public class Command_main {

    public static void main(String[] args) {

        /*
            Command Pattern(커멘드 패턴)
            실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴이다.
         */

        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("A"));

        for (Command command : queue) {
            command.execute();
        }
    }
}