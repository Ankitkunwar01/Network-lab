import java.net.*;
import java.util.*;

public class seven {
    public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        while (nets.hasMoreElements()) {
            NetworkInterface ni = nets.nextElement();
            System.out.println("Interface: " + ni.getName());
            Enumeration<InetAddress> addrs = ni.getInetAddresses();
            while (addrs.hasMoreElements()) {
                System.out.println("  Address: " + addrs.nextElement());
            }
        }
    }
}
