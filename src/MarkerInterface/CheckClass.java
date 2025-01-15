package MarkerInterface;

import java.lang.ref.SoftReference;
import java.util.List;

public class CheckClass implements Printable{

    private String name;

    public CheckClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    public void addElement(List<String> ls){
        ls.add("paras");
    }
}
