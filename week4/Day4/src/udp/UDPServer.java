package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try{
            socket = new DatagramSocket(1234); //DatagramSocket 객체 생성 및 포트번호 전달
            byte[] receiveData = new byte[1024];

            while (true) {
                // 데이터 패킷 수신
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                //수신 메시지 출력
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("수신된 클라이언트 메시지 : " + message);
            }
        }catch (SocketException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }
}
