import java.io.*;

public class twelve {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");

            System.out.println("IP: " + (parts.length > 0 ? parts[0] : "N/A"));
            System.out.println("Request: " + (parts.length > 1 ? parts[1] : "N/A"));
            System.out.println("Time: " + (parts.length > 3 ? parts[3] : "N/A"));
            System.out.println("---------------------");
        }

        br.close();
    }
}
