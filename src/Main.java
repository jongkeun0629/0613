class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("성인만 가입 가능.");
        } else {
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("종근");
        person.setAge(26);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

