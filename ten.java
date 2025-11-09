import java.net.*;

public class ten {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("www.google.com");
        byte[] bytes = ip.getAddress();

        for (byte b : bytes) {
            System.out.println(b & 0xFF);
        }
    }
}
