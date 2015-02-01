package csci6461_project;

public class Execute {
	String insPseudo;
	String insBinary;
	
	public Execute(String aString){
		this.insPseudo = aString;
	}
	
	public String instructionTranslator(){
		String op = insPseudo.substring(0,3);
		switch (op.toUpperCase()) {
		case "LDR":
			String binary = null;
			String Opcode, R, IX, I, Address;
			Opcode = "000001";
			
			String[] tokens = insPseudo.substring(4).split(",");
			
			R = DataTypeConvertor.intToString(Integer.valueOf(tokens[0]));
			IX = DataTypeConvertor.intToString(Integer.valueOf(tokens[1]));
			I = DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
			Address = "00000";
			
			binary = Opcode+R+IX+I+Address;
			
			return binary;
			

		default:
			return null;
		}
	}
	
	/**
	public String LDRTranslator(){
		String binary;
		String Opcode, R, IX, I, Address;
		Opcode = "000001";
		
		String[] tokens = insPseudo.substring(3).split(",");
		
		R = DataTypeConvertor.intToString(Integer.valueOf(tokens[0]));
		IX = DataTypeConvertor.intToString(Integer.valueOf(tokens[1]));
		I = DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
		Address = "00000";
		
		binary = Opcode+R+IX+I+Address;
		
		return binary;
				
	}
	
	*/
	public String instructionTranslator(String ins){
		return null;
	}
	
}
