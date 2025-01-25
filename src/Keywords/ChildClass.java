package Keywords;

public class ChildClass extends ParentClass{

    String name = "overridden name ";
    String email ;

    public ChildClass(String name,String email) {
//        super(name);
        System.out.println("child constructor");
        this.email = email;
    }

    void getName(){
        System.out.println(super.name + " " + email);
    }

}
