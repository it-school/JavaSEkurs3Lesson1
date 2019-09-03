package itschool.Classes;

import java.util.regex.Pattern;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        long start1 = System.nanoTime();
        for (Character character : name.toCharArray())
            if (Character.isDigit(character))
            {
                this.name = "";
                return;
            }
        long start2 = System.nanoTime();
        this.name = name;
        long start3 = System.nanoTime();
        if (Pattern.compile("[0-9]+").matcher(name).find())
        {
            this.name = "";
            return;
        }
        long start4 = System.nanoTime();
        this.name = name;
       // System.out.println(start2-start1);
       // System.out.println(start4-start3);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 200 && age >= 0 ? age : -1;
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Person() {
    }

    @Override
    public String toString() {
        String result = "Person{" +
                "name='" + (!name.equals("") ? name : "Incorrect name" );
        if (age != -1 )
            result += ", age=" + age;
        result+="}";
        return result;
    }
}
