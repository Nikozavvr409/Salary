package salary.employer;

public class Employer {
    private String name;
    private String lastname;
    public Employer(){
        name = "Sergey";
        lastname = "Ivanov";
    }
    public Employer(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return  name + " " + lastname;
    }
}
