package Immutability;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final NormalClass normalClass;
    private final String email;
    private final String organization;
    private final List<String> list;


    public ImmutableClass(NormalClass normalClass, String email, String organization,List<String> list) {
        this.normalClass = normalClass;
        this.email = email;
        this.organization = organization;
        this.list = list;
    }

    public List<String> getList() {
        // if we return this list, it can add elements to this ,making it mutable.
//        return list;
        // so we return copy of the list,
        return new ArrayList<>(list);
    }

    public NormalClass getNormalClass() {
        // return deep copy so that user is unable to change this, making this immutable
        return new NormalClass(normalClass.getName(), normalClass.getAge(), normalClass.salary);
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }
}
