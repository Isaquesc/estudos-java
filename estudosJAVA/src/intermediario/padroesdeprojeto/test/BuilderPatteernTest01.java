package intermediario.padroesdeprojeto.test;

import intermediario.padroesdeprojeto.dominio.Person;

public class BuilderPatteernTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.aPerson()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
};
    