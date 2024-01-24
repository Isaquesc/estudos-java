package intermediario.collections.devDojo.dominio;

public class SmartPhone {

    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //REFLEXIVO: x.equals(x) tem que ser true para tudo que for diferente de null
    //SIMÉTRICO: para x e y diferente de null, se x.equals(y) == true, y.equals(x) == true
    //TRANSITIVIDADE: para x,y,z diferente de null, se x.equals(y) == true, y.equals(x) == true, y.equals(z) == true
    //CONSISTENTE: x.equals(x) sempre retorna true se x for diferente de null
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(this == obj)
            return true;

        if (this.getClass() != obj.getClass())
            return false;

       SmartPhone smartPhone = (SmartPhone) obj;
       return smartPhone.getSerialNumber() != null && this.serialNumber.equals(smartPhone.getSerialNumber());

    }

    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
