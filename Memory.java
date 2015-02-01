package csci6461_project;

public class Memory{
	private String[] memory;
	private int memoryCounter=0;
	private int memoryLength;
	private int sixteenBitMax = 16;
	
	
	public Memory(int amemoryLength){
		this.memoryLength = amemoryLength;
		memory = new String[memoryLength]; //expendable for 4096
	}

	
	public String getMemory(int i){
		if(i<memoryLength){
			if(memory[i]==null)
				return "-1";
			else
				return memory[i];
		}
		else 
			return "-1";
	}

	
	public int setMemory(int location, String content){
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad addressing
        // status of 2 is location preserved
		// status of 3 is overflow
        
		int status = 0;
		
		if(location<memoryLength){
			if(content.length()>=sixteenBitMax){
				memory[location] = content;	//keep overflow item with status 3
				memoryCounter++;
				return 3;
			}
			else if(location>=0&&location<=5){
				return 2;	//condition for preserved location
			}
			else{
				memory[location] = content;
				memoryCounter++;
				status = 0;
				return status;
			}
		}
		else
			return 1;
		
	}
	
	public int checkAddressLength(int i){
		int length = 0;
		return memory[i].length();	
	}
	
	
}

