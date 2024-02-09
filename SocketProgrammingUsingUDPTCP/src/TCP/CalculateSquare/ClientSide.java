package TCP.CalculateSquare;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        String host = "localhost";
        int portNumber = 9988;
        try (
            Socket socket = new Socket(host, portNumber);
            Scanner scanner = new Scanner(System.in);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream())
        ) {
            System.out.println("Connected to server.");
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            out.writeInt(number); // Write the integer to the server
            int square = in.readInt(); // Read the integer sent by the server
            System.out.println("Server said: The square of the number is " + square);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
