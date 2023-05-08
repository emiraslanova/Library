public class Kitab {
    public String name;
    String yazici;

    Kitab(String name, String yazici) {
        this.name = name;
        this.yazici = yazici;
    }

    @Override
    public String toString() {
        return "Kitab{" +
                "name='" + name + '\'' +
                ", yazici='" + yazici + '\'' +
                '}';
    }
}



