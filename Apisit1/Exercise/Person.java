package Exercise;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = "n/a";
        this.age = 1;
    }

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        if (gender == "n/a" && age == -1) {
            return getName();
        }
        return String.format("%s is a %d year old %s", getName(), age, gender);
    }
}

