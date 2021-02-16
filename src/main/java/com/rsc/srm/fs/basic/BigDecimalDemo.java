package com.rsc.srm.fs.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

	public static void main(String[] args) {
		
;
		
		BigDecimal bdecnok= new BigDecimal(Math.PI);
		System.out.println(bdecnok); //25.25
		
		
		/**
		 * INR TO USD
		 * EUR to Jamican Dollar --- EUR TO USD, USD to JDLR
		 */
		
		BigDecimal bdec= new BigDecimal("12.34");
		
		BigDecimal bdec2= new BigDecimal(Math.PI + "");
		
		
		
		System.out.println(Math.PI);
		
		System.out.println(bdec.setScale(3,RoundingMode.CEILING).toString());
		
		BigDecimal bd3 = bdec.multiply(new BigDecimal("34.56"));
		
		System.out.println(bd3.setScale(4,RoundingMode.CEILING));
		
		System.out.println(bdec.compareTo(bd3)); //0
		
		System.out.println(bd3.intValue());
		
		
	}

}
