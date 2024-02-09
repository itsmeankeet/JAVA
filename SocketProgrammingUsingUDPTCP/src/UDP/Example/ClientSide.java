package UDP.Example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        int portNumber = 9988;
        // Create DatagramSocket and Scanner objects
        try (DatagramSocket socket = new DatagramSocket(); Scanner scanner = new Scanner(System.in)) {
            InetAddress address = InetAddress.getByName("localhost");
            
            // Prompt user for input
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            
            // Convert input string to bytes
            byte[] sendingMessage = name.getBytes();
            
            // Create DatagramPacket for sending
            DatagramPacket packet = new DatagramPacket(sendingMessage, sendingMessage.length, address, portNumber);

            // Send packet
            socket.send(packet);

            // Display the local port number of the socket
            System.out.println("Client is connected to port " + socket.getLocalPort());

            // Receive response packet
            byte[] receivedData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receivedData, receivedData.length);
            socket.receive(receivePacket);

            // Convert received bytes to string and display
            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println(receivedMessage);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
