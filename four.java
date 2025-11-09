import java.net.*;

public class four {
    public static void main(String[] args) throws Exception {
        // InetAddress ip = InetAddress.getByName("2404:6800:4004:80d::200e");
        InetAddress ip = InetAddress.getByName("192.168.0.0");

        if (ip instanceof Inet4Address) {
            System.out.println("IPv4 Address");
        } else if (ip instanceof Inet6Address) {
            System.out.println("IPv6 Address");
        }
    }
}
