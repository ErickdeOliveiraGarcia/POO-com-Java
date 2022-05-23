package exemplo;


  public class B extends A{
    private int vb;

    public B(){
        super();
    }
    public B(int va, int vb){
        super(va);
        this.setVb(vb);
    }
    
    public int getVb(){
        return vb;
    }
    public void setVb( int vb){
        this.vb = vb;
    }

    public void mb(){
        System.out.println("");
    }
    }

