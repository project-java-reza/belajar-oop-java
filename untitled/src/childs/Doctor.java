package childs;

import parents.PersonParents;

public class Doctor extends PersonParents {
    private String specialist;

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    public void surgery() {
        System.out.println("I can surgery operation Patients");
    }

    public void greeting() {
        System.out.println("Hello my name is " + getName()+ ".");
        System.out.println("I, come from " + getAddress()+ ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }

    // Getter dan Setter
    public String getSpecialist() {
        return this.specialist;
    }
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
