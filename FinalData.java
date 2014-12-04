package mts;



public class FinalData {

	public String stack;
	public String ipTokens;
	public String lookUp;
	public String actionValue;
	public String valueOfLhs;
	public String lengthOfRhs;
	public String tempStack;
	public String gotoLookUp;
	public String gotoValue;
	public String stackAction;
	public String parseTreeStack;
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public String getIpTokens() {
		return ipTokens;
	}
	public void setIpTokens(String ipTokens) {
		this.ipTokens = ipTokens;
	}
	public String getLookUp() {
		return lookUp;
	}
	public void setLookUp(String lookUp) {
		this.lookUp = lookUp;
	}
	public String getActionValue() {
		return actionValue;
	}
	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
	}
	public String getValueOfLhs() {
		return valueOfLhs;
	}
	public void setValueOfLhs(String valueOfLhs) {
		this.valueOfLhs = valueOfLhs;
	}
	public String getLengthOfRhs() {
		return lengthOfRhs;
	}
	public void setLengthOfRhs(String lengthOfRhs) {
		this.lengthOfRhs = lengthOfRhs;
	}
	public String getTempStack() {
		return tempStack;
	}
	public void setTempStack(String tempStack) {
		this.tempStack = tempStack;
	}
	public String getGotoLookUp() {
		return gotoLookUp;
	}
	public void setGotoLookUp(String gotoLookUp) {
		this.gotoLookUp = gotoLookUp;
	}
	public String getGotoValue() {
		return gotoValue;
	}
	public void setGotoValue(String gotoValue) {
		this.gotoValue = gotoValue;
	}
	public String getStackAction() {
		return stackAction;
	}
	public void setStackAction(String stackAction) {
		this.stackAction = stackAction;
	}
	public String getParseTreeStack() {
		return parseTreeStack;
	}
	public void setParseTreeStack(String parseTreeStack) {
		this.parseTreeStack = parseTreeStack;
	}
	public FinalData(String stack, String ipTokens, String lookUp,
			String actionValue, String valueOfLhs, String lengthOfRhs,
			String tempStack, String gotoLookUp, String gotoValue,
			String stackAction, String parseTreeStack) {
		super();
		this.stack = stack;
		this.ipTokens = ipTokens;
		this.lookUp = lookUp;
		this.actionValue = actionValue;
		this.valueOfLhs = valueOfLhs;
		this.lengthOfRhs = lengthOfRhs;
		this.tempStack = tempStack;
		this.gotoLookUp = gotoLookUp;
		this.gotoValue = gotoValue;
		this.stackAction = stackAction;
		this.parseTreeStack = parseTreeStack;
	}
	public FinalData() {
		super();
	}
	@Override
	public String toString() {
		return "FinalData [stack=" + stack + ", ipTokens=" + ipTokens
				+ ", lookUp=" + lookUp + ", actionValue=" + actionValue
				+ ", valueOfLhs=" + valueOfLhs + ", lengthOfRhs=" + lengthOfRhs
				+ ", tempStack=" + tempStack + ", gotoLookUp=" + gotoLookUp
				+ ", gotoValue=" + gotoValue + ", stackAction=" + stackAction
				+ ", parseTreeStack=" + parseTreeStack + "]";
	}
	
}
