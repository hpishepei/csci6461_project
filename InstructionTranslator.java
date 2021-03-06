package csci6461_project;

public class InstructionTranslator {
	String insPseudo;
	
	public InstructionTranslator(String aString) {
		this.insPseudo = aString;
	}
	
	public static String[] tokens(String aString, int fields){
		String[] result = new String[fields];
		for(int i=0;i<fields;i++)
			result[i]="";
		//result[1] = "";
		for(int i=0, j=0;i<aString.length();i++){
			if(aString.charAt(i)!=' '&&aString.charAt(i)!=',')
				result[j]+=aString.charAt(i);
			else if(aString.charAt(i)==' ')
				continue;
			else if(aString.charAt(i)==',')
				j++;
		}
		return result;
	}
	
	
	public String translator(){
		String op = insPseudo.substring(0,3);
		switch (op.toUpperCase()) {
		case "LDR":
			String binary = null;
			String Opcode, R, IX, I, Address;
			Opcode = "000001";
			
			String[] tokens = tokens(insPseudo.substring(4),3);
			
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
	

	
}
