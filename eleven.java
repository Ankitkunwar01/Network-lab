import java.net.*;

public class eleven {
    public static void main(String[] args) throws Exception {
        String[] spamIPs = {"192.168.1.10", "10.0.0.5"};

        InetAddress sender = InetAddress.getByName("192.168.10.10");

        for (String s : spamIPs) {
            if (sender.getHostAddress().equals(s)) {
                System.out.println("Spam detected!");
                return;
            }
        }
        System.out.println("Not Spam");
    }
}
