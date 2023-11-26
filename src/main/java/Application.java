import java.util.Scanner;

public class Application extends Connector {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Application app = new Application();
        app.connect();
        app.scan(scanner);
        app.disconnect();
    }
}
