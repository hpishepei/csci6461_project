package csci6461_project;

public class InstructionDecoder {
	
	String insBinary;

	public InstructionDecoder(String aString){
		this.insBinary=aString;
	}
	
	public void decoder(){
		String op = insBinary.substring(0,6);
		switch (op) {
		case "000001":
			String binary = null;
			String Opcode, R, IX, I, Address;
			Opcode = "000001";
			
			String[] tokens = tokens(insBinary.substring(4),3);
			
			R = DataTypeConvertor.intToString(Integer.valueOf(tokens[0]));
			IX = DataTypeConvertor.intToString(Integer.valueOf(tokens[1]));
			I = DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
			Address = "00000";
			
			binary = Opcode+R+IX+I+Address;
			
			break;
			

		default:
			break;
		}
	}
	
	
}
