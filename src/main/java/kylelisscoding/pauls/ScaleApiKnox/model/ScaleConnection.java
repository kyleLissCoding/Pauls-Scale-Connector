package kylelisscoding.pauls.ScaleApiKnox.model;
import java.io.*;
import java.net.Socket;

public class ScaleConnection {

    public static double connectToScale(String ip, int Port) {

        //Connection parameters
        String hostname = ip; //todo: Modify to match your device's address!
        int port = Port;

        System.out.println("Connecting to " + hostname + ":" + port);
        try (Socket socket = new Socket(hostname,port)) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true))
            {
                out.println("Connected!");
                try {
                    for (int i = 0; i < 10; i++) {
                        out.println("SI"); // Request weight IP = Immediate Print
                        out.println("Sending the second frame.");
                        out.println("Sending the third frame.");
                        String message = in.readLine(); // Read response from scale
                        System.out.println(message);
                        Thread.sleep(500); // Wait
                    }
                } catch (InterruptedException e) { //Required due to Thread.sleep
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}