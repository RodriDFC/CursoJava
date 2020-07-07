package interfaces;

public class UsoInterfaces implements InterfaceEjemplo{

    private String var1;
    public String tomarDecicion(String desicion){
        return "se tomo la siguiente desicion "+desicion;
    }
    public String getVar1(){return var1;}

    public void setVar1(String var1) {
        this.var1 = var1;
    }
}
