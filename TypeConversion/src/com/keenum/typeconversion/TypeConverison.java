package com.keenum.typeconversion;

public class TypeConverison {

		public static void main(String[] args){
			
			float floatVal = 1.0f;
			double doubleVal = 4.0d;
			byte byteVal = 7;
			short shortVal = 7;
			long longVal = 5;
			
			short result1 = (short)longVal;
			short result2 = (short)(byteVal - longVal);
			float result3 = (float)(longVal - doubleVal);
			long result4 = (long)(shortVal - longVal + floatVal + doubleVal);
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			
		}
}
