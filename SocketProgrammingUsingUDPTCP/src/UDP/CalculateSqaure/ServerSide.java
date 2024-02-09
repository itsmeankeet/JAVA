package UDP.CalculateSqaure;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class ServerSide {
    public static void main(String[] args) {
        int portNumber = 9988;
        try (
            //create a datagramsocket's object giveing server portnumer
            DatagramSocket socket = new DatagramSocket(portNumber);
        ) {
            while (true) {
                //byte array to store incomming data
                byte[] incommingData = new byte[2000];
                //datagrampacket to recieve incomming packets
                DatagramPacket packet = new DatagramPacket(incommingData, incommingData.length);
                System.out.println("Waiting for clients"); 
                System.out.println("<html><body><h2>Ayo AYou</h2></body></head>");
                //recieve the packet
                socket.receive(packet);
                System.out.println("Connection Established"); 
                //Lets calculate the square of number using clienthandler 
                ClientHandler handler = new ClientHandler(socket, packet);
                handler.start();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
