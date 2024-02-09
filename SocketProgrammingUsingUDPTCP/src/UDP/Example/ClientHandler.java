package UDP.Example;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.IOException;

class ClientHandler extends Thread {
    private DatagramPacket packet;
    private DatagramSocket socket;

    public ClientHandler(DatagramPacket packet, DatagramSocket socket) {
        this.packet = packet;
        this.socket = socket;
    }

    public void run() {
        try {
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();
            byte[] receivedData = packet.getData();
            int length = packet.getLength();

            String receivedMessage = new String(receivedData, 0, length);
            String newMessage = "Do you even code?" + receivedMessage;
            System.out.println(newMessage);
            byte[] sendData = newMessage.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(sendPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
