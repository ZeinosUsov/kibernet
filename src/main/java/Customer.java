import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customers") public class customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String email;

    @OneToMany(mappedby = "customer", cascade = CascadeType.ALL)
    private List <Order> = new ArrayList<>();

    public customer() {}

    public customer(String name, String email) {

        this.name =name;
        this.email =email;

    }

    public long getid() {
        return id;
    }
}

public void setld(long id) {
    this.id = id;
}
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}

public String getemail() {
    return email;
}

public void setemail(String email) {
    this.email = email;
}

public List getorders() {
    return (List) Order;
}

public void setorders(List orders) {
    this.Order = Order;
}

private Object Order;


/*
public class customers {

    private int id;
    private string name;
    private string email;




    public customers(int id, string name, string email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public customers() {

    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public string getname() {
        return name;
    }

    public void setname(string name) {
        this.name = name;
    }

    public string getemail() {
        return email;
    }

    public void setemail(string email) {
        this.email = email;
    }

    @override
    public string tostring() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}*/