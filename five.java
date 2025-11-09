import java.net.*;

public class five {
    public static void main(String[] args) throws Exception {
        InetAddress[] addrs = InetAddress.getAllByName("www.google.com");
        for (InetAddress a : addrs) {
            System.out.println(a);
        }
    }
}
