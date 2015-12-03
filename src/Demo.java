/**
 * Created by YB on 03.12.2015.
 */
public class Demo {

    public static void main(String [] args)
    {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setAge(33);
        p2.setAge(22);
        p3.setAge(33);

        p1.setName("Ivan");
        p2.setName("Vasya");
        p3.setName("Ivan");

        p1.setSalary(888);
        p2.setSalary(777);
        p3.setSalary(888);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p1));

        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.hashCode() == p3.hashCode());
        System.out.println(p1.hashCode() == p1.hashCode());

    }

}
