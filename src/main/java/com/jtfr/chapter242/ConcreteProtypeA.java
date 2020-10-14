package com.jtfr.chapter242;

import java.util.List;

/**
 * 具体需要克隆的类  ConcretePrototypeA
 */
public class ConcreteProtypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public ConcreteProtypeA clone() {
        ConcreteProtypeA concreteProtypeA = new ConcreteProtypeA();
        concreteProtypeA.setAge(this.age);
        concreteProtypeA.setName(this.name);
        concreteProtypeA.setHobbies(this.hobbies);
        return concreteProtypeA;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "ConcreteProtypeA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
