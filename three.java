import java.net.*;

public class three {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("8.8.8.8");
            System.out.println("Canonical Hostname: " + ip.getCanonicalHostName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
