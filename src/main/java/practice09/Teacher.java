package practice09;


public class Teacher extends Person{
    protected Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (getKlass() == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + getKlass().getNumber() + ".";
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() +".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }

    }

}
