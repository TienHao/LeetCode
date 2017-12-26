package com.leetcode.easy;

public class Easy69SqrtX {
    public int mySqrt(int x) {
        int upper = 46341;
        int lower = 0;
        int sqr = 0;
        while(1<upper-lower){
            sqr = (upper + lower)/2;
            if(sqr*sqr>x){
                upper = sqr;
            }else if(sqr*sqr<x){
                lower = sqr;
            }else{
                return sqr;
            }
        }

        return lower;
    }
    
	public static void main(String[] args) {

	}

}
