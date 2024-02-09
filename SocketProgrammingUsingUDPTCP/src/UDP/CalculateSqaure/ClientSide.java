package UDP.CalculateSqaure;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Scanner;
public class ClientSide {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
        ) {
            InetAddress address = InetAddress.getByName("localhost");
            int portNumber =9988;

            //Get input from user
            System.out.println("Enter the number\n");
            int number = scanner.nextInt();

            //Convert into byte code
            byte[] numberInByte = ByteBuffer.allocate(Integer.BYTES).putInt(number).array();

            //Prepare a packet 
            DatagramPacket sendPacket = new DatagramPacket(numberInByte, numberInByte.length, address, portNumber);
            //sending packets to the server 
            socket.send(sendPacket);

            //recive the packet from the server 
            //make a container to recieve the value 
            byte[] container = new byte[2000];
            DatagramPacket recievedPacket = new DatagramPacket(container, container.length);
            socket.receive(recievedPacket);

            //converting packet to int
            int square = ByteBuffer.wrap(container).getInt();

            //printing the square of the number
            System.out.println("Server Says: "+square );
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error 404 "+e.getMessage());
        }
    }
}