import java.util.Objects;

public class Autor {
   private String name;
   private String surname;

    public Autor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public  String getSurname(){
        return this.surname;
    }

    public String toString() {
        return "Имя и фамилия автора : " + this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Autor autor = (Autor) obj;

        return Objects.equals(name, autor.name) &&
                Objects.equals(surname, autor.surname);
    }
    public int hashCode() {
        return Objects.hashCode(name) + Objects.hashCode(surname) * 31;
    }

}
