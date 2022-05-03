package com.atguigu.java2;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        method1(8, 2); // 1.定义一个方法，该方法的功能是打印两个数的和
        method2(8); // 2.定义一个方法，该方法的功能是打印几几乘法表
        method3(9); // 3.定义一个方法，该方法的功能是判断某个变量是奇数还是偶数
        method4(1, 100); // 4.定义一个方法，该方法的功能是打印n到m之间的所有的奇数
        int[] a = {1,2,3,4};
        method5(a); // 5.定义一个方法，该方法的功能是遍历数组
        int[] b = {2,4,7,10,27};
        method6(b); // 6.定义一个方法，该方法的功能是获取数组中元素的最大值

        // 8.分析以下需求，并用代码实现(每个小需求都需要封装成方法)
        int c=1;
        double d=1.0;
        method81(c, d); // 8.1 判断两个数据是否相等(整数和小数)
        method82(c, d); // 8.2.获取两个数中较大的值(整数和小数)
        method83(c, d); // 8.3.获取两个数中较小的值(整数和小数)
        method84(c, d); // 8.4.获取两个数中较小的值(整数和小数)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长");
        int length = scanner.nextInt();
        System.out.println("请输入宽");
        int width = scanner.nextInt();
        method91(length, width); // 定义方法计算该长方形的周长,并在main方法中打印周长
        method92(length, width); // 定义方法计算该长方形的面积,并在main方法中打印面积

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入半径");
        int radius = scanner1.nextInt();
        method93(radius); // 定义方法计算该圆的周长,并在main方法中打印周长
        method4(radius); // 定义方法计算该圆的面积,并在main方法中打印面积
    }

    /**
     * 定义方法计算该圆的面积,并在main方法中打印面积
     *
     * @param radius 半径
     */
    private static void method4(int radius) {
        double area = Math.PI* Math.pow(radius, 2);
        System.out.println("面积为"+area);
    }

    /**
     * 定义方法计算该圆的周长,并在main方法中打印周长
     *
     * @param radius 半径
     */
    private static void method93(int radius) {
        double perimeter = 2*Math.PI* radius;
        System.out.println("周长为"+perimeter);
    }

    /**
     * 定义方法计算该长方形的面积,并在main方法中打印面积
     *
     * @param length 长度
     * @param width  宽度
     */
    private static void method92(int length, int width) {
        int area = length * width;
        System.out.println("面积为"+area);
    }

    /**
     * 定义方法计算该长方形的周长,并在main方法中打印周长
     *
     * @param length 长度
     * @param width  宽度
     */
    private static void method91(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("周长为"+perimeter);
    }

    /**
     * 4.否能用一个方法实现2和3的两个功能
     *
     * @param c 任意整数
     * @param d 任意小数
     */
    private static void method84(int c, double d) {
        String result= c > d ? "最大值为" + c+";最小值为"+d : "最大值为" + d+";最小值为"+c ;
        System.out.println(result);
    }
    /**
     * 8.3.获取两个数中较小的值(整数和小数)
     *
     * @param c 任意整数
     * @param d 任意小数
     */
    private static void method83(int c, double d) {
        int result= c > d ? c : (int) d;
        System.out.println(result);
    }

    /**
     * 8.2.获取两个数中较大的值(整数和小数)
     *
     * @param c 任意整数
     * @param d 任意小数
     */
    private static void method82(int c, double d) {
        int result= c > d ? c : (int) d;
        System.out.println(result);
    }

    /**
     *  1.判断两个数据是否相等(整数和小数)
     * @param c 任意整数
     * @param d 任意小数
     */
    private static void method81(int c, double d) {
        String result= c == d ?"相等":"不相等";
        System.out.println(result);
    }

    /**
     * 6.定义一个方法，该方法的功能是获取数组中元素的最大值
     *
     * @param a 任意一维数组
     */
    private static void method6(int[] a) {
        int max= a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println(max);
    }

    /**
     * 5.定义一个方法，该方法的功能是遍历数组
     *
     * @param a 任意一维数组
     */
    private static void method5(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int i = a[j];
            System.out.println(i);
        }
    }

    /**
     * 4、定义一个方法，该方法的功能是打印n到m之间的所有的奇数
     *
     * @param a 任意数n
     * @param b 任意数m
     */
    private static void method4(int a, int b) {
        System.out.println(a+"-"+b+"间所有奇数:");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     *  3.定义一个方法，该方法的功能是判断某个变量是奇数还是偶数
     *
     * @param a 任意数
     */
    private static void method2(int a) {
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    /**
     * 2.定义一个方法，该方法的功能是打印几几乘法表
     *
     * @param a 任意数
     */
    private static void method3(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }

    /**
     * 1.定义一个方法，该方法的功能是打印两个数的和
     *
     * @param a 任意数1
     * @param b 任意数2
     */
    private static void method1(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

class Test01{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] temp1 = arr1;
        int[] temp2 = arr1;
        System.out.println("通过temp1取出数组值: ");

        for(int i = 0;i<temp1.length;i++) {
            System.out.print(temp1[i]+" "); // 结果 1 2 3 4 5
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: ");
        for(int i = 0;i<temp2.length;i++) {
            System.out.print(temp2[i]+" "); // 结果 1 2 3 4 5
        }
        System.out.println();
        temp1[2] = 9;

        System.out.println("通过temp1取出数组值: ");
        for(int i = 0;i<temp1.length;i++) {
            System.out.print(temp1[i]+" "); // 结果 1 2 9 4 5
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: ");
        for(int i = 0;i<temp2.length;i++) {
            System.out.print(temp2[i]+" "); // 结果 1 2 9 4 5
        }
        System.out.println();
    }
}


class Test02{
    /**
     * 7.看程序说结果，请不要提前运行？
     *
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7};
        int[] temp = arr1;

        System.out.println("通过temp取出arr1中的元素: ");

        for(int i = 0;i<temp.length;i++) {
            System.out.print(temp[i]+" "); // 结果 1 2 3 4 5
        }

        temp = arr2;

        System.out.println("通过temp取出arr2中的元素: ");

        for(int i = 0;i<temp.length;i++) {
            System.out.print(temp[i]+" "); // 结果 5 6 7
        }

    }
}

