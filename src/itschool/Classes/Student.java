package itschool.Classes;

public class Student extends Person {
    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend < 0 ? -1 : stipend;
    }

    int stipend;

    public Student(String name, int age, int stipend) {
        super(name, age);
        this.setStipend(stipend);
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result.replace("Person", "Student");
        result = result.substring(0, result.length()-1) + ", stipend: " + stipend +"grn}";
        return result;
    }
}
