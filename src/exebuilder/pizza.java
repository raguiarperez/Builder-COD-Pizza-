package exebuilder;

/**
 * @author raguiarperez
 */
public class pizza {

    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    public pizza(float grHarina, float mlAgua, float grSal, float mlAceite, String tipoAceite, float grTomate, float grQueso, String tipoQueso, float grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    public float getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(float grHarina) {
        this.grHarina = grHarina;
    }

    public float getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
    }

    public float getgrSal() {
        return grSal;
    }

    public void setgrSal(float grSal) {
        this.grSal = grSal;
    }

    public float getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public float getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(float grTomate) {
        this.grTomate = grTomate;
    }

    public float getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(float grQueso) {
        this.grQueso = grQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public float getGrPinha() {
        return grPinha;
    }

    public void setGrPinha(float grPinha) {
        this.grPinha = grPinha;
    }

    public void calentar() {

    }

    @Override
    public String toString() {
        return "pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", tipoAceite=" + tipoAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", tipoQueso=" + tipoQueso + ", grPinha=" + grPinha + '}';
    }
    
}
