package com.atguigu.java1;

public class LambdaTest3 {
    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName() + "i:" + i);
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            System.out.println("main" + "i:" + i);
        }
    }
}

