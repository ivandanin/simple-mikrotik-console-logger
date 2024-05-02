import java.util.Scanner;

public class Application extends Connector {
        static Application app = new Application();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        app.connect();
        app.read(scanner);
        // make a call to print all the logs and push it into afrr file, that will be used as a machine learning output
        app.disconnect();
    }
}
