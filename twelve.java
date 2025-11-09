import java.io.*;

public class twelve {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            System.out.println("IP: " + parts[0]);
            System.out.println("Request: " + parts[1]);
            System.out.println("Time: " + parts[3]);
            System.out.println("---------------------");
        }
        br.close();
    }
}
