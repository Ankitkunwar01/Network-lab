import java.net.*;

public class eight {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("www.google.com");

        // a. Simple timeout
        System.out.println("Reachable: " + ip.isReachable(3000));

        // b. Using NetworkInterface
        NetworkInterface ni = NetworkInterface.getByName("eth0");
        System.out.println("Reachable via interface: " + ip.isReachable(ni, 50, 3000));
    }
}
