package intermediario.resourceBundle;


import java.util.ResourceBundle;

public class ResouceBundleTest {
    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("menssagensResouceBundle");
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));

    }
}
