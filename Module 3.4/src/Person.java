import java.io.Serializable;

public class Person implements Serializable {
    private String firstname;
    private  String lastname;
    private int birthyear;

    public Person(){
        firstname = ";";
        lastname = ";";
        birthyear = 0;

    }

    public Person(String firstname, String lastname, int birthyear){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }
    public String getName(){
        return firstname + " " + lastname;
    }
    @Override
    public String toString(){
        return firstname + " " + lastname + " " + birthyear + "years";
    }
}


