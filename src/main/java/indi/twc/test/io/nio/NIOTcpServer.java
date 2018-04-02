package indi.twc.test.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NIOTcpServer {
    private static final int PORT = 5556;
//    private static ByteBuffer byteBuffer = ByteBuffer.allocate(10240);
    private static int number = 0;

    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(PORT));
        serverSocketChannel.configureBlocking(false);

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("server start on port " + PORT + " ...");

        while (true) {
            selector.select();

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();

                if (!selectionKey.isValid()) {
                    continue;
                }

                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel serverChannel = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = serverChannel.accept();
                    socketChannel.configureBlocking(false);
                    SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);

                    new Thread(new SendRunnable(socketChannel)).start();
                    Socket socket = socketChannel.socket();
                    System.out.println("Get a client, the remote client address: " + socket.getRemoteSocketAddress());
                } else if (selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    socketChannel.socket().setReceiveBufferSize(102400);

                    String remoteAddress = socketChannel.socket().getRemoteSocketAddress().toString();

                    processNormally(socketChannel);
                }

                iterator.remove();
            }
        }

    }

    private static class SendRunnable implements Runnable {
        private SocketChannel socketChannel;

        private SendRunnable(SocketChannel socketChannel) {
            this.socketChannel = socketChannel;
        }

        @Override
        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                try {
                    String msg = bufferedReader.readLine();
                    this.socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private static void processNormally(SocketChannel socketChannel) throws IOException {
        StringBuffer sb = new StringBuffer();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (socketChannel.read(byteBuffer) > 0) {
            byteBuffer.flip();
            sb.append(new String(byteBuffer.array()));
            byteBuffer.clear();
        }
        System.out.println(sb.toString() + " <---> " + number++);
    }

}

