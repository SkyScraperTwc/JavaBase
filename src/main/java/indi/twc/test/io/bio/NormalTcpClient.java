package indi.twc.test.io.bio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import indi.twc.test.utils.*;

/**
 * Created by shaohang.zsh on 2016/7/13.
 */
public class NormalTcpClient {

    private static final int PORT = 5555;
    private static final String IP_ADDRESS = "127.0.0.1";

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket(IP_ADDRESS, PORT);
        System.out.println("Connecting to server ip: " + IP_ADDRESS + ", port: " + PORT);
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        Thread sendThread = new Thread(new SendRunnable(dout));
        Thread printThread = new Thread(new PrintRunnable(dis, "server"));

        sendThread.start();
        printThread.start();

        sendThread.join();
        printThread.join();

        socket.close();
    }
}
