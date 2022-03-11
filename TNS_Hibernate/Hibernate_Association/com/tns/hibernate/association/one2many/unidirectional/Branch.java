package com.tns.hibernate.association.one2many.unidirectional;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the BRANCH database table.
 * 
 */
@Entity
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "BRANCH_ID")
	private int branchId;

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "BRANCH_SHORT_NAME")
	private String branchShortName;

	private String description;

	// uni-directional one-to-many association to Student
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "BRANCH_ID", nullable = false)
	private List students; // Each branch have many Students (list of)

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchShortName() {
		return branchShortName;
	}

	public void setBranchShortName(String branchShortName) {
		this.branchShortName = branchShortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List getStudents() {
		return students;
	}

	public void setStudents(List students) {
		this.students = students;
	}

}
