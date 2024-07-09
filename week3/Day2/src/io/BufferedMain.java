package io;

import java.io.*;

public class BufferedMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("이름을 입력해 주세요: ");
        bufferedWriter.write("name: ");
        bufferedWriter.write(bufferedReader.readLine());

        System.out.println("나이를 입력해 주세요: ");
        bufferedWriter.write(", age : ");
        bufferedWriter.write(bufferedReader.readLine());

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
