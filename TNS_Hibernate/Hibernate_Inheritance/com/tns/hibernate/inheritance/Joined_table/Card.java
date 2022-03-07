package com.tns.hibernate.inheritance.Joined_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Crd_pay")
public class Card extends Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "CrdNo")
	private int Cardno;

	@Column(name = "CrdType")
	private String card_Type;

	public int getCardno() {
		return Cardno;
	}

	public void setCardno(int cardno) {
		Cardno = cardno;
	}

	public String getCard_Type() {
		return card_Type;
	}

	public void setCard_Type(String card_Type) {
		this.card_Type = card_Type;
	}

}
