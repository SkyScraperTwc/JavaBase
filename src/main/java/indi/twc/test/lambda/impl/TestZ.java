package indi.twc.test.lambda.impl;

import indi.twc.test.lambda.InterfaceZ;

public class TestZ {
    public static void main(String[] args) {
        //1.0
        InterfaceZ interfaceZ = new InterfaceZ() {
            @Override
            public void print(int x, int y) {
                System.out.println(x+y);
            }
        };
        interfaceZ.print(1,2);

        //2.0
        InterfaceZ interfaceZ1 = (int x, int y) -> {
            System.out.println(x+y);
            System.out.println(x+y);
            System.out.println(x+y);

        };
        interfaceZ1.print(3,4);

        //3.0
        ((InterfaceZ) (x, y) -> {
            System.out.println(x+y);
        }).print(5,6);



    }
}
