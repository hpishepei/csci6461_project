package csci6461_project;

public class Register {
	private String[] GPR, IndexR;
	//private String R0, R1, R2, X1, X2, X3;
	private String PC, CC, IR, MAR, MBR, MSR, MFR;
	
	
	
	public Register(){
		GPR = new String[4];
		IndexR = new String[3];	
	}



	public String getGPR(int i) {
		if(i<4&&GPR[i]!=null){
			return GPR[i];
		}
		else if(i>=4)
			return "bad_address";
		else
			return "no_content";
	}



	public boolean setGPR(int i,String content) {
		if(i>=0&&i<4&&content.length()==16){
			GPR[i] = content;
			return true;
		}
		else 
			return false;
	}



	public String getIndexR(int i) {
		if(i<3&&IndexR[i]!=null){
			return IndexR[i];
		}
		else if(i>=3)
			return "bad_address";
		else
			return "no_content";
	}
	


	
	public boolean setIndexR(int i, String content) {
		if(i>=0&&i<3&&content.length()==12){
			IndexR[i] = content;
			return true;
		}
		else 
			return false;
	}



	public String getPC() {
		if(PC!=null){
			return PC;
		}
		else
			return "no_content";
	}
	

	public boolean setPC(String pC) {
		if(pC.length()==12){
			PC = pC;
			return true;
		}		
		else
			return false;
	}



	public String getCC() {
		if(CC!=null){
			return CC;
		}
		else
			return "no_content";
	}


	public boolean setCC(String cC) {
		if(cC.length()==4){
			CC = cC;
			return true;
		}		
		else
			return false;
	}


	public String getIR() {
		if(IR!=null){
			return IR;
		}
		else
			return "no_content";
	}


	public boolean setIR(String iR) {
		if(iR.length()==16){
			IR = iR;
			return true;
		}		
		else
			return false;
	}


	public String getMAR() {
		if(MAR!=null){
			return MAR;
		}
		else
			return "no_content";
	}



	public boolean setMAR(String mAR) {
		if(mAR.length()==16){
			MAR = mAR;
			return true;
		}		
		else
			return false;
	}



	public String getMBR() {
		if(MBR!=null){
			return MBR;
		}
		else
			return "no_content";
	}


	public boolean setMBR(String mBR) {
		if(mBR.length()==16){
			MBR = mBR;
			return true;
		}		
		else
			return false;
	}




	public String getMSR() {
		if(MSR!=null){
			return MSR;
		}
		else
			return "no_content";
	}



	public boolean setMSR(String mSR) {
		if(mSR.length()==16){
			MSR = mSR;
			return true;
		}		
		else
			return false;
	}


	public String getMFR() {
		if(MFR!=null){
			return MFR;
		}
		else
			return "no_content";
	}

	public boolean setMFR(String mFR) {
		if(mFR.length()==4){
			MFR = mFR;
			return true;
		}		
		else
			return false;
	}
	
	
}
