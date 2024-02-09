import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {

    public static void main(String[] args) {
        System.out.println("Client Started..");
        try {
            Socket socket = new Socket("localhost", 9806);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your message right now...");
            String messageString = scanner.nextLine(); // Read user input
            //send data to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(messageString);
            
            // Read response from server
            Scanner responseScanner = new Scanner(socket.getInputStream());
            String newMessage = responseScanner.nextLine();
            System.out.println(newMessage);
            
            scanner.close(); // Close the scanner after use
            responseScanner.close(); // Close the response scanner
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
