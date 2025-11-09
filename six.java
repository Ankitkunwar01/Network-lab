import java.net.*;

public class six {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getByName("www.google.com");
        InetAddress ip2 = InetAddress.getByName("www.google.com");

        if (ip1.equals(ip2)) {
            System.out.println("Both are same IP addresses");
        } else {
            System.out.println("Different IP addresses");
        }
    }
}
