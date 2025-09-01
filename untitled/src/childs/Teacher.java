package childs;

import parents.PersonParents;

public class Teacher extends PersonParents {
   private String subject;

   public Teacher() {

   }

   public Teacher(String name, String address, String subject) {
       super(name, address);
       this.subject = subject;
   }

   public void teaching() {
       System.out.println("I can teach " + subject + ", So anyone who wants to learn can talk to me.");
   }

   public void greeting() {
       System.out.println("Hello my name is " + getName() + ".");
       System.out.println("I come, from " + getAddress() + ".");
       System.out.println("My job is a " + subject + " teacher.");
   }

   public String getSubject() {
       return this.subject;
   }
   public void setSubject(String subject) {
       this.subject = subject;
   }
}
