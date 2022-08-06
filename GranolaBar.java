public class GranolaBar {
    //properties
    public String name;
    public String flavor;
    public boolean hasNuts;

    //constructors
    public GranolaBar() {
        this("Choco-Crazy", "Triple Chocolate", true);
    }

    public GranolaBar(String name, String flavor, boolean hasNuts){
        this.name = name;
        this.flavor = flavor;
        this.hasNuts = hasNuts;
        System.out.println("A granola bar object has been created.");
    }

    //methods
    public String toString() {
        return this.name + " is " + this.flavor + " flavored and has nuts: " + this.hasNuts;
    }
}
