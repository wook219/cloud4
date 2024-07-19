import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpRequestByURLConnection {
    public static void main(String[] args) throws IOException {

        try{
            // URL 객체 생성 및 HttpURLConnection 획득
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=seoul&APPID=0f0917207ee5a2f60a1ef6d03c62941d");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //HTTP 헤더 설정
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            //HTTP 상태 코드 받아오기
            int responseCode = connection.getResponseCode();
            System.out.println("HTTP 상태 코드 : " + responseCode);

            if(responseCode != HttpURLConnection.HTTP_OK){
                System.out.println("커넥션 에러 발생");
                System.out.println(connection.getResponseMessage());
                return;
            }

            //입출력 스트림 생성 및 데이터 읽어오기
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch (MalformedURLException e){
            System.out.println("URL Malformed: " + e.getMessage());
        }
    }
}
