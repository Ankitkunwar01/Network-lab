import java.net.*;

public class nine {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("224.0.0.5");

        System.out.println("Loopback: " + ip.isLoopbackAddress());
        System.out.println("Multicast: " + ip.isMulticastAddress());
        System.out.println("Wildcard: " + ip.isAnyLocalAddress());
    }
}
