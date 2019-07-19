package building;

public abstract class Building implements IShow{
    private String material;
    private String buffer;

    @Override
    public void show(){
        System.out.println(material + " by interface");
    }

    public Building(String material){
        this.material = material;
        this.buffer = material;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        if (!material.isEmpty()){
            this.material = material;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    //method for redefine
    public void show(int i){
        System.out.println(i);
    }

    public void printMaterial(){
        System.out.println(buffer + ' ' + material);
    }
}

