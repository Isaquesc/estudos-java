package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("1AQ63W79", "Apple");
        SmartPhone s2 = new SmartPhone("1AQ63W79", "Apple");
        System.out.println(s1.equals(s2));
    }
}
