package com.leetcode.easy;

public class Easy67AddBinery {

    public String addBinary(String a, String b) {
    	int aLength = a.length();
    	int bLength = b.length();
    	if(aLength>=bLength){
    		StringBuffer bb = new StringBuffer();
    		for(int i=0;i<aLength-bLength;i++){
    			bb.append('0');
    		}
    		b=bb.append(b).toString();
    	}else{
    		StringBuffer aa = new StringBuffer();
    		for(int i=0;i<bLength-aLength;i++){
    			aa.append('0');
    		}
    		a=aa.append(a).toString();
    		aLength = a.length();
    	}
    	StringBuffer result = new StringBuffer ();
    	int previous = 0;
    	for(int i = 0; i < aLength; i++){
    		int sum = previous+Character.getNumericValue(a.charAt(aLength - i -1))+Character.getNumericValue(b.charAt(aLength - i -1));
    		if(sum==0){
    			result.append('0');
    			previous=0;
    		}else if(sum==1){
    			result.append('1');
    			previous=0;
    		}else if(sum==2){
    			result.append('0');
    			previous=1;
    		}else{
    			result.append('1');
    			previous=1;
    		}
    	}
        if(previous ==1){
        	result.append('1');
        }
    	return result.reverse().toString();
    }
	public static void main(String[] args) {
		Easy67AddBinery test = new Easy67AddBinery();
		test.addBinary("11", "1");
	}

}
