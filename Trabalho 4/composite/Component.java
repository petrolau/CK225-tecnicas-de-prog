package composite;

public interface Component {

    public void operation();

    public void add(Component l);

    public void remove(Component l);

    public Component getChild(int index);

    public double getValue();
    
}
