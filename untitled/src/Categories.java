public class Categories {
    // Menggunakan access modifier private pada field atau attribute
    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories() {
        super();
    }

    // Contoh Getter dan Setter tipe data boolean

    // Getter
    public boolean isExpensive() {
        return this.expensive;
    }

    // Setter
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    // Contoh Getter dan Setter tipe data object

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
       this.name = name;
    }

    // Contoh Getter dan Setter tipe data primitif

    // Getter
    public int getId() {
        return this.id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }
}
