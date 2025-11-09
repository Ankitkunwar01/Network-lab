import java.net.*;

public class two {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host Name: " + local.getHostName());
            System.out.println("Local IP: " + local.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
