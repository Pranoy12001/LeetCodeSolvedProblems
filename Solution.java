

public class Solution {
	public String defangIPaddr(String address) {
        String[] ipSplits = address.split("\\.");
        
        String returnedIp = "";
        
        for(String ip : ipSplits) {
        	returnedIp += ip + "[.]";
        }
        
        if(returnedIp.length() > 3) {
        	returnedIp = returnedIp.substring(0, returnedIp.length() - 3);
		}
        return returnedIp;
    }
}
