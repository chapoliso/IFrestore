package Produto;

public class Notebook extends Produto {
	
	private int memoriaRAM;
    private String processador;
    
    public Notebook() {
    	
    	
    }   

	public int getMemoriaRAM() {
        return memoriaRAM;
    }
    
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    
    public String getProcessador() {
        return processador;
    }
    
    public void setProcessador(String processador) {
        this.processador = processador;
    }

}
