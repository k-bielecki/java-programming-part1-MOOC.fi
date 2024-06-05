public class Cube {
    private int edgeLenght;

    public Cube (int edge) {
        this.edgeLenght = edge;
    }

    public int volume() {
        return edgeLenght * edgeLenght * edgeLenght;
    }

    public String toString() {
        return "The length of the edge is " + edgeLenght + " and the volume " + volume();
    }
}
