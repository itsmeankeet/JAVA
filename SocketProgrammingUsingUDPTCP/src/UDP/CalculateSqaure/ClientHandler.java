package UDP.CalculateSqaure;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
class ClientHandler extends Thread{
    DatagramSocket socket;
    DatagramPacket packet;
    public ClientHandler(DatagramSocket socket, DatagramPacket packet) {
        this.socket = socket;
        this.packet = packet;
    }

    public void run() {
        //get the ip of  client
        InetAddress clientAddress = packet.getAddress();
        //get the port of the client
        int portNumber = packet.getPort();
        //get the data in byte array
        byte[] recievedData = packet.getData();
        //get th length of the byte array
        int length = recievedData.length;
    
        //convert byte array to integer 
        int recievedNumber = ByteBuffer.wrap(recievedData).getInt();



        //calculate the square of the number
        int square = recievedNumber * recievedNumber;
        //convert the square into byte array 
        recievedData = ByteBuffer.allocate(Integer.BYTES).putInt(square).array();   
        //make packet ready to send
        DatagramPacket sendPacket = new DatagramPacket(recievedData, recievedData.length, clientAddress, portNumber);
        //launch the packet
        try {
            socket.send(sendPacket);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
