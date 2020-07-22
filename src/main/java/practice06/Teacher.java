package practice06;

public class Teacher extends Person{
    protected int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = -1;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (getKlass() == -1) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
    }
}
