import java.util.ArrayList;
import java.util.List;

public class Student implements Element{
    private String nume;
    private String email;
    private List<Element> element = new ArrayList<>();

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public void print() {
        System.out.println("       "+nume +" , " + email);
        for(Element el:element) {
            el.print();
        }

    }

    @Override
    public void add(Element elemente) {
    element.add(elemente);
    }

    @Override
    public void addContent(Element elemente) {
    element.add(elemente);
    }

    @Override
    public void remove(Element elemente) {
    element.remove(elemente);
    }

    @Override
    public Element get(int i) {
        return element.get(i);
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }
}
