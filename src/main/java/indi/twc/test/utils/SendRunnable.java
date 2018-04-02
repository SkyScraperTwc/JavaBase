package indi.twc.test.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SendRunnable implements Runnable {

    private DataOutputStream dos;
    public SendRunnable(DataOutputStream dos) {
        this.dos = dos;
    }

    @Override
    public void run() {

        while (true) {
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String msgToSend = bufReader.readLine();
                dos.writeUTF(msgToSend);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
