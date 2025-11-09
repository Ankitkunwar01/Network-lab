import java.net.*;

public class domain {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("newsummit.edu.np");
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
