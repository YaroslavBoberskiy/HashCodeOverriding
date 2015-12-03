/**
 * Created by YB on 03.12.2015.
 */
public class Demo {

    public static void main(String [] args)
    {

        Address p1Address = new Address();
        Address p2Address = new Address();
        Address p3Address = new Address();

        p1Address.setCity("Kyiv");
        p2Address.setCity("Fastiv");
        p3Address.setCity("Kyiv");

        p1Address.setStreet("Street1");
        p2Address.setStreet("Street2");
        p3Address.setStreet("Street1");

        p1Address.setHouse(12);
        p2Address.setHouse(11);
        p3Address.setHouse(12);

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

        p1.setAddress(p1Address);
        p2.setAddress(p2Address);
        p3.setAddress(p3Address);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p1));

        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.hashCode() == p3.hashCode());
        System.out.println(p1.hashCode() == p1.hashCode());

    }

}
