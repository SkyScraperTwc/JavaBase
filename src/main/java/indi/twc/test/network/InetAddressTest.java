package indi.twc.test.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress实例
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(Arrays.toString(address.getAddress()));
        System.out.println(address.getCanonicalHostName());
        //获取IP地址
        System.out.println(address.getHostAddress());
        //获取计算机名
        System.out.println(address.getHostName());
    }
}
