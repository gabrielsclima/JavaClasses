package exemploclassecaneta;

public class Caneta {
    String marca, modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    void riscar(){}
    void tampar(){}
    void destampar(){}
    void estado(){
        System.out.println("Essa caneta é do modelo: " + this.modelo);
        System.out.println("Essa caneta é da marca: " + this.marca);
        System.out.println("Essa caneta é da cor: " + this.cor);
        System.out.println("Essa caneta tem a ponta: " + this.ponta);
        System.out.println("Essa caneta está com a carga: " + this.carga);
        System.out.println("Essa caneta está Tampada? " + this.tampada);
    }
}
