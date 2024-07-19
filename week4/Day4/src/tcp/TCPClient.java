package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        // 서버 IP 주소 및 포트 번호를 사용하여 Socket 객체 생성
        Socket clientSocket = new Socket("localhost", 1234);

        // 서버와의 통신을 위한 입출력 스트림
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("서버에 보낼 메시지를 입력하세요 : ");
        sentence = inFromUser.readLine();

        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();

        System.out.println("서버로부터 응답 : " + modifiedSentence);

        //소켓 자원 해제
        clientSocket.close();
    }
}
