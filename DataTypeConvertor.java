package csci6461_project;

public class DataTypeConvertor {
	
	public DataTypeConvertor(){
		
	}
	
	public int stringToInt(String s){
		int result=0;

		for(int i=s.length()-1;i>=0;i--){
			result += Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,s.length()-i-1);
		}
		return result;
	}
	
	public int intToString(int i){
		return Integer.valueOf(Integer.toBinaryString(i));

	}
}
