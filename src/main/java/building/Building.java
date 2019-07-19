package building;

        import com.sun.istack.internal.NotNull;
        import sun.invoke.empty.Empty;

public abstract class Building {
    protected String material;
    private String buffer;
    public building(String material){
        this.material = material;
        this.buffer = material;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(@NotNull String material){
        if (!material.isEmpty()){
            this.material = material;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    //method for redefine
    protected void show(int i){
        System.out.println(i);
    }

    protected void printMaterial(){
        System.out.println(buffer + " " + material);
    }
}

