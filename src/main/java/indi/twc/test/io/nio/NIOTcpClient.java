package indi.twc.test.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by shaohang.zsh on 2016/7/14.
 */
public class NIOTcpClient {

    private static final int PORT = 5556;
    private static final String IP_ADDRESS = "localhost";
    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);

        socketChannel.connect(new InetSocketAddress(IP_ADDRESS, PORT));
        while (!socketChannel.finishConnect());

        new Thread(new SendRunnable(socketChannel)).start();

        System.out.println("Connecting to " + IP_ADDRESS + " on " + PORT);
        while (true) {
            selector.select();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {

                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isReadable()) {
                    SocketChannel channel = (SocketChannel) selectionKey.channel();
                    StringBuilder sb = new StringBuilder();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    while (channel.read(byteBuffer) > 0) {
                        byteBuffer.flip();
                        sb.append(new String(byteBuffer.array()));
                        byteBuffer.clear();
                    }
                    System.out.println("[server] " + sb.toString());
                }
                iterator.remove();
            }
        }
    }

    private static class SendRunnable implements Runnable {

        private SocketChannel socketChannel;
        public SendRunnable(SocketChannel socketChannel) {
            this.socketChannel = socketChannel;
        }
        public void run() {
            System.out.println("Type to send message:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                socketChannel.socket().setSendBufferSize(102400);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            int number = 0;
            while (true) {
                try {
                    // take input as the message source
                    String msg = bufferedReader.readLine();
                    // send the message continuously
//                    String msg = "hello world " + number++;
                    // send data normally
                    socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
                    // add the head represent the data length
//                    socketChannel.write(ByteBuffer.wrap(new PacketWrapper(msg).getBytes()));
                    // make the data length fixed
//                    socketChannel.write(ByteBuffer.wrap(new FixLengthWrapper(msg).getBytes()));
//                    System.out.println(number);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
