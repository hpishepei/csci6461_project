package csci6461_project;

public class Execute {
	String insPseudo;
	String insBinary;
	
	public Execute(String aString){
		this.insPseudo = aString;
	}
	
	public void instructionTranslator(){
		String op = insPseudo.substring(0,2);
		switch (op) {
		case "LDR":
			this.LDRTranslator(insPseudo);
			
			break;

		default:
			break;
		}
	}
	
	public String LDRTranslator(String aString){
		String Pse = aString;
		String Opcode, IX, R, I, Address;
		Opcode = ins.substring(0,5);
		
		
		return null;
	}
	
	public String instructionTranslator(String ins){
		return null;
	}
	
}
