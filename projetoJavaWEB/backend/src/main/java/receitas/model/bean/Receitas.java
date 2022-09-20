package receitas.model.bean;

public class Receitas {
    private int id;
    private String ingredientes;
    private String modoPreparo;
    private String utensilios;
    private String rendimento;
    private String tempoPreparo;

    public Receitas(int id) {
        this.id = id;
    }

    public Receitas(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receitas(int id, String ingredientes, String modoPreparo, String utensilios, String rendimento, String tempoPreparo) {
        this.id = id;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.utensilios = utensilios;
        this.rendimento = rendimento;
        this.tempoPreparo = tempoPreparo;
    }

    public Receitas(String ingredientes, String modoPreparo, String utensilios, String rendimento, String tempoPreparo) {
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.utensilios = utensilios;
        this.rendimento = rendimento;
        this.tempoPreparo = tempoPreparo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getUtensilios() {
        return utensilios;
    }

    public void setUtencilios(String utencilios) {
        this.utensilios = utencilios;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }

    public String getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public String toString() {
        return "Receitas{" + "id=" + id + ", ingredientes=" + ingredientes + ", modoPreparo=" + modoPreparo + ", utencilios=" + utensilios + ", rendimento=" + rendimento + ", tempoPreparo=" + tempoPreparo + '}';
    }
    
}
