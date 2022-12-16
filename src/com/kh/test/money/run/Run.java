package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;

public class Run {

	public static void main(String[] args) {
		
		Money money = new Money();
		money.setMoney(10000);
		
		money.print();
	}

}
