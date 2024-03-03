package intermediario.stream.dominio;

public class LightNovel {
    private String title;
    private double price;
    private Category CATEGORIAS;

    public LightNovel(String title, double price, Category CATEGORIAS) {
        this.title = title;
        this.price = price;
        this.CATEGORIAS = CATEGORIAS;
    }

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", CATEGORIAS=" + CATEGORIAS +
                '}';
    }

    public Category getCATEGORIAS() {
        return CATEGORIAS;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
