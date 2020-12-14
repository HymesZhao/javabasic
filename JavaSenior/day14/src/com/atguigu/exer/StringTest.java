package com.atguigu.exer;

/**
 * 一道面试题
 * @author shkstart
 * @create 2019 上午 11:32
 */
public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    int a=3;
    People people=new People("zhangsan",3);

    public void change(String str, char ch[],int a,People people) {
        str = "test ok";
        ch[0] = 'b';
        a=4;
        people.setAge(4);
        people.setName ("lisi") ;
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch,ex.a,ex.people);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
        System.out.println(ex.a);//3
        System.out.println(ex.people.age+","+ex.people.name);//4,lisi
    }
}
class People{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }
}

