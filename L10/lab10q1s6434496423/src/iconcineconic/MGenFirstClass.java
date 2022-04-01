package iconcineconic;

public class MGenFirstClass extends MGenCard{
    private int freeticket=2;
    public MGenFirstClass(String name) {
        super(name);
    }
    public void getFreeTicket(){
        if(freeticket>=2){
            freeticket-=2;
            System.out.println("You got 2 Cinema tickets");
        }
        else{
            System.out.println("You already got the free tickets");
        }
        System.out.println(this.toString());
    }
    public String toString(){
        return super.toString()+"[free ticket : "+freeticket+"]";
    }
}
