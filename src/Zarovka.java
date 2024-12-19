
public class Zarovka {

    private boolean sviti;
    private String jmeno;


    public Zarovka(){
        sviti = false;
        System.out.println("Zavolan bezparametricky konstruktor");
    }

    public Zarovka(boolean sviti) {
        this.sviti = sviti;
    }

    public void rozsvit() {
        sviti = true;
    }

    public void zhasni() {
        sviti = false;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setSviti(boolean sviti) {
        this.sviti = sviti;
    }

    public boolean isSviti() {
        return sviti;
    }


}
