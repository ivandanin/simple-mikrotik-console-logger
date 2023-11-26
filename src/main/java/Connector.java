import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.MikrotikApiException;

import javax.net.SocketFactory;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

abstract class Connector {

    protected void connect() throws MikrotikApiException {
        connection = ApiConnection.connect(SocketFactory.getDefault(), Config.HOST, ApiConnection.DEFAULT_PORT, 2000);
        connection.login(Config.USERNAME, Config.PASSWORD);
    }

    protected void disconnect() throws Exception {
        connection.close();
    }

    protected void scan(Scanner scanner) throws MikrotikApiException {
        System.out.println("Please, insert a command you want to be executed!");
        while (!scanner.nextLine().equals("end")) {
            List<Map<String, String>> results = connection.execute(scanner.nextLine());
            for (Map<String, String> result : results) {
                System.out.println(result);
            }
        }
    }

    protected static ApiConnection connection;
}
