
package lab3;


public class Lugares {
    public int ExtencionT;
    public int NIntegrantes;

    public Lugares() {
    }

    public Lugares(int ExtencionT, int NIntegrantes) {
        this.ExtencionT = ExtencionT;
        this.NIntegrantes = NIntegrantes;
    }

    public int getExtencionT() {
        return ExtencionT;
    }

    public void setExtencionT(int ExtencionT) {
        this.ExtencionT = ExtencionT;
    }

    public int getNIntegrantes() {
        return NIntegrantes;
    }

    public void setNIntegrantes(int NIntegrantes) {
        this.NIntegrantes = NIntegrantes;
    }

    @Override
    public String toString() {
        return "Lugares{" + "ExtencionT=" + ExtencionT + ", NIntegrantes=" + NIntegrantes + '}';
    }
    
    
}
