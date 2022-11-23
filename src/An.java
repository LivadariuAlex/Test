import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    public An(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    private String nume;
    private List<Element> element = new ArrayList<>();


    @Override
    public void print() {
        System.out.println(nume);
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
        element.get(i);
        return null;
    }
}
