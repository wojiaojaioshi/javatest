public class reflecttest2 {
    public static void main(String[] args) {
        Student stu1=new Student();
        Class stuClass=stu1.getClass();
        System.out.println(stuClass.getName());

        Class stuClass2=Student.class;
        System.out.println(stuClass==stuClass2);

        try {
            Class stuClass3=Class.forName("Student");
            System.out.println(stuClass3==stuClass2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}



