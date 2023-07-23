//public class Dog implements Cloneable{
//    private String name;
//    private Person owner;
//
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//            Dog d=null;
//            d=(Dog)super.clone();
//            d.owner=(Person)owner.clone();
//            return d;
//    }
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Dog d=new Dog();
//        Person p=new Person(18,"程序员小蒋");
//        d.owner=p;
//
//        Dog clonedog=(Dog)d.clone();
//        p.setName("小蒋");
//        System.out.println(clonedog.owner.getName());
//    }
//}
