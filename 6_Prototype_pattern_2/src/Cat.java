public class Cat implements Cloneable{

    private String name;
    private Age age;

    public Cat(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat replica = (Cat) clone();
        replica.setAge(new Age(this.age.getBirthDay(), this.age.getAge()));
        return replica;
    }
}
