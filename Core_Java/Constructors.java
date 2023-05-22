package Core_Java;

public class Constructors {
    private int id;
    private String name;

    public Constructors() {
        id = 0;
        name = "Your-Name-Here";
    }

    public Constructors(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public Constructors(String myName) {
        id = 1;
        name = myName;
    }

    public static void main(String[] args) {
        Constructors harry = new Constructors("ProgrammingWithHarry", 12);
        Constructors harsh = new Constructors();
//        harsh.setName("CodeWithHarry");
//        harsh.setId(34);
//        System.out.println(harsh.getId());
//        System.out.println(harsh.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}
