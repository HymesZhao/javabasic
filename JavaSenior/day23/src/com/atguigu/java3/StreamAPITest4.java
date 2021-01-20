package com.atguigu.java3;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest4 {
    public static List<Student> studentInformation() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("张三", 45, "男"));
        students.add(new Student("李四", 25, "女"));
        students.add(new Student("王麻子", 36, "男"));
        students.add(new Student("王二", 56, "女"));
        students.add(new Student("刘文", 35, "男"));
        students.add(new Student("王对方", 34, "女"));
        students.add(new Student("高星", 74, "女"));
        students.add(new Student("张明", 13, "男"));
        return students;
    }

    @Test
    public void Test1() {
        List<Student> students = StreamAPITest4.studentInformation();
        for (Integer age :
                students.stream().map(Student::getAge).collect(Collectors.toList())) {
            System.out.println(age);
        }

//        System.out.println(students.stream().filter(str ->
//                str.getGender().equals("男")).count());
//
//        System.out.println(students.stream().count());
//
//        for (Student student :
//                students.stream().limit(8).distinct().filter(student ->
//                        student.getAge() > 50).collect(Collectors.toList())) {
//            System.out.println(student.getName());
//        }
    }

    /**
     * 测试flatMap类似于addAll的功能
     */
    @Test
    public void flatMapTest() {
        List<Integer> collected0 = new ArrayList<>();
        collected0.add(1);
        collected0.add(3);
        collected0.add(5);
        List<Integer> collected1 = new ArrayList<>();
        collected1.add(2);
        collected1.add(4);
        collected1 = Stream.of(collected0, collected1)
                .flatMap(num -> num.stream()).collect(Collectors.toList());
        System.out.println(collected1);// 1,3,5,2,4

    }
}
