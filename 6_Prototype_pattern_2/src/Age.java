public class Age {

    private String birthDay;
    private Integer age;

    public Age(String birthDay, Integer age) {
        this.birthDay = birthDay;
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "birthDay='" + birthDay + '\'' +
                ", age=" + age +
                '}';
    }
}
