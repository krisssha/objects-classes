public class Main {
    public static void main(String[] args) {
        Autor number1 = new Autor("Joan", "Rowling");
        Autor number2 = new Autor("George", "Martin");
        Book harryPotter = new Book("Joan", number1, 2001);
        Book aGameOfThrones = new Book("George", number2, 1996);
        // System.out.println("number1.name = " + number1.name);
        // System.out.println("number2.name = " + number2.name);
        System.out.println("harryPotter.getPublicationYear() = " + harryPotter.getPublicationYear());
        System.out.println("aGameOfThrones.getPublicationYear() = " + aGameOfThrones.getPublicationYear());
        harryPotter.setPublicationYear(2005);
        System.out.println("harryPotter.getPublicationYear() = " + harryPotter.getPublicationYear());
        aGameOfThrones.setPublicationYear(1999);
        System.out.println("aGameOfThrones.getPublicationYear() = " + aGameOfThrones.getPublicationYear());
        System.out.println("Следующее задание : ");
        System.out.println(harryPotter);

        System.out.println("equals Autor = " + number1.equals(number2));
        System.out.println("equels Book  = " + harryPotter.equals(aGameOfThrones));
        System.out.println(" Autor number1 hashcode : " + number1.hashCode());
        System.out.println(" Autor number2 hashcode : " + number1.hashCode());
        System.out.println("Book harryPotter hashcode : " + harryPotter.hashCode());
        System.out.println("Book aGameOfThrones hashcode : " + aGameOfThrones.hashCode());


    }


}