package intermediario.padroesdeprojeto.builder.test;

import intermediario.padroesdeprojeto.builder.dominio.Person;

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
