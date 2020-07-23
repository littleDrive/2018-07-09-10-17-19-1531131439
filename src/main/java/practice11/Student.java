package practice11;

public class Student extends Person{

    protected Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (getKlass() != null && getKlass().getLeader() != null && this.getId() == getKlass().getLeader().getId()) {
            return super.introduce() + " I am a Student. I am Leader of Class " + getKlass().getNumber() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at Class " + getKlass().getNumber() + ".";
        }
    }

}
