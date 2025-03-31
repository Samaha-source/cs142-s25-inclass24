package inherit1;

public class DogDemo {


    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setAge(2);

        Dog toto = new Dog();
        toto.setName("Toto");
        toto.setAge(1);

        ShowDog alf = new ShowDog();
        alf.setName("Alf");
        alf.setAge(3);

        alf.speak();
        fido.speak();

        System.out.println(fido);
        System.out.println(toto);
        System.out.println(alf);
    }
}
