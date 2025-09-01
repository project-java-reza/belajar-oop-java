package childs;

import parents.PersonParents;

public class Programmer extends PersonParents {
   private String technology;

   public Programmer() {
       super();
   }

   public Programmer(String name, String address, String technology) {
       super(name, address);
       this.technology = technology;
   }

   public void coding() {
       System.out.println("I can create a application using technology : " + technology + ".");
   }

   public void hacking() {
       System.out.println("I can hacking a website.");
   }

   @Override
    public void greeting() {
       super.greeting(); // Memanggil method greeting dari parent atau PersonParent Class
       System.out.println("My job is a " + technology + " programmer");
   }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
