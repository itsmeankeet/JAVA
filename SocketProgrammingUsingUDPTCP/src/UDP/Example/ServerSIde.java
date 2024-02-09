package UDP.Example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerSIde {
    public static void main(String[] args) {
        int portNumber = 9988;
        // Create a connection
        // Initialize a DatagramSocket to listen on a specified port
        try (DatagramSocket socket = new DatagramSocket(portNumber)) {
            // Print a message indicating the server is running and listening on the specified port
            System.out.println("Server is running and listening for incoming connections on port " + portNumber);
            // Infinite loop to continuously listen for incoming connections
            while (true) {
                // Print a message indicating the server is waiting for a client to connect
                System.out.println("Waiting for a client to connect...");
                // Create a byte array to store incoming data
                byte[] bytes = new byte[2024];
                // Create a DatagramPacket to receive incoming packets
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                // Receive a packet from a client
                socket.receive(packet);
                // Print a message indicating the client has connected from a specific port
                System.out.println("Client connected from the port " + packet.getPort());
                // Create a new instance of ClientHandler to handle client communication
                ClientHandler clientHandler = new ClientHandler(packet, socket);
                // Start the client handler thread
                clientHandler.start();
            }
        } catch (Exception e) {
            // Print an error message if an exception occurs
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
