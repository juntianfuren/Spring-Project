package com.jtfr.chapter242;

import java.util.ArrayList;

/**
 * 测试代码
 */
public class PrototypeTest {

    public static void main(String[] args) {
        // 具体的克隆对象
        ConcreteProtypeA concreteProtypeA = new ConcreteProtypeA();
        // 填充属性测试
        concreteProtypeA.setAge(18);
        concreteProtypeA.setName("prototype");
        ArrayList<String> hobbies = new ArrayList<String>();
        concreteProtypeA.setHobbies(hobbies);
        System.out.println(concreteProtypeA.toString());

        // 创建 Client 对象，准备开始克隆
        Client client = new Client(concreteProtypeA);
        Prototype prototype = client.startClone(concreteProtypeA);
        System.out.println(prototype.toString());
        /**
         * 测试结果表示，hobbies的引用地址是相同的，意味着复制的不是只，而是引用的地址。
         */
        System.out.println("克隆对象中的应用类型地址值："+((ConcreteProtypeA)prototype).getHobbies().toString());
        System.out.println("原对象中的引用类型的地址值："+concreteProtypeA.getHobbies().toString());
        System.out.println("对象地址比较"+(((ConcreteProtypeA)prototype).getHobbies() == concreteProtypeA.getHobbies()));
    }
}
