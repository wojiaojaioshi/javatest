public class Cat  implements Cloneable{

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    private String name;
    private Person owner;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public static void main(String[] args) throws CloneNotSupportedException{
        Cat c=new Cat();
        Person p=new Person(18,"程序员小蒋");
        c.owner=p;

        Cat clonecat=(Cat)c.clone();
        p.setName("小蒋");
        System.out.println(clonecat.owner.getName());
        System.gc();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person{

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

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;
}
