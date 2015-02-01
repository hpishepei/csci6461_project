package csci6461_project;

public class test {
	public static void main(String args[]){
		String aString = "100";

		System.out.println(aString.charAt(0)=='0');
		
		DataTypeConvertor aConvertor = new DataTypeConvertor();
		System.out.println(aConvertor.stringToInt("10"));
		System.out.println(aConvertor.intToString(9));

		String a = "123";
		System.out.println(a.charAt(2));
		
		//MemoryControl m = new MemoryControl(10);
		//System.out.println(m.getClass().getFields().toString());
		//m.setMemory(6, "111");
		
		String aa = "11010";
		System.out.println(Integer.toBinaryString(11));
		//System.out.println(m.getMemory(6));
		
		//Memory mm = new Memory();
		//mm.setMemoryContent("111");
		//mm.getMemoryContent();
		//System.out.println(	m.setMemory(8,"111"));
		
		Register register = new Register();
		register.setIndexR(0, "1111111111111111");
		System.out.println(	register.getIndexR(0));
		
		Execute execute = new Execute("LDR 3,0,31");
		System.out.println(execute.instructionTranslator());
		String aaa= "LDR 3,0,31";
		System.out.println(		aaa.substring(0,3));
		String[] tokens = aaa.substring(4).split(",");
		System.out.println(Integer.valueOf(tokens[0]));
		System.out.println(tokens[1]);




		
	}
}
