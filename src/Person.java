/**
 * Created by YB on 03.12.2015.
 */
public class Person {

    private String name;
    private int age;
    private long salary;

    public Person() {

    }

    // Getters

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    // equals and hashCode overriding

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person) && (((Person) o).getSalary() == this.salary) &&
                (((Person) o).getName() == this.name) && (((Person) o).getAge() == this.age)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {

        final int result = 99;

        String objName = getName();
        Long objSalary = getSalary();
        Integer objAge = getAge();

        int cName = objName.hashCode();
        int cSalary = objSalary.hashCode();
        int cAge = objAge.hashCode();

        int resName = 37 * result + cName;
        int resSalary = 37 * result + cSalary;
        int resAge = 37 * result + cAge;

        return resAge + resName + resSalary;
    }

}
