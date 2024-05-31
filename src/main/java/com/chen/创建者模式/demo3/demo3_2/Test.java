package com.chen.创建者模式.demo3.demo3_2;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("red");
        Person person = new Person("zhang",car);
        Person person1 = person.clone();
        System.out.println(person.hashCode() == person1.hashCode());//false
        System.out.println(person.getCar().hashCode() == person1.getCar().hashCode());//true
        System.out.println(person.getName().hashCode() == person1.getName().hashCode());//true
        person1.getCar().setColor("blue");
        person1.setName("liu");
        System.out.println(person.getCar().getColor());//blue
        System.out.println(person1.getCar().getColor());//blue
        System.out.println(person.getName());//zhang
        System.out.println(person1.getName());//liu
    }
}

class Person implements Cloneable{
    private String name;
    private Car car;

    public Person(String name,Car car) {
        this.car = car;
        this.name = name;
    }

    public Person clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (Person) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}

class Car{
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
