import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class HttpRequestBySocket {
    private static final String HOST = "api.openweathermap.org";
    private static final int PORT = 443;

    public static void main(String[] args) {
        //SSL 연결(https 통신)을 위한 소켓 생성
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try(Socket socket = factory.createSocket(HOST, PORT);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(outputStream, true);

        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){

        //HTTP 요청 헤더 작성
        writer.println("GET /data/2.5/weather?q=seoul&appid=0f0917207ee5a2f60a1ef6d03c62941d HTTP/1.1");
        writer.println("Host: " + HOST);
        writer.println("User-Agent: Chrome");
        writer.println("Connection: close");

        //응답 읽기 및 데이터 출력
        StringBuilder response = new StringBuilder();
        String line;
        boolean isContent = false;
        while((line = reader.readLine()) != null){
            if(!isContent){
                if(line.isEmpty()){
                    isContent = true;
                }
                continue;
            }
            response.append(line);
        }
            System.out.println(response.toString());
        }catch (IOException e){
            System.out.println("IO Exception : " + e.getMessage());
        }
    }
}
