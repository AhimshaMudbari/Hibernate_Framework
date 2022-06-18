package com.hibernate.MavenHibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "director_detail")
public class DirectorName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "name_id")
	private int id;
	@Column(length = 20, name = "first_name")
	private String firstName;
	@Column(length = 20, name = "last_name")
	private String secondName;
	@Column(name = "is_popular")
	private boolean isPopular;
	@Transient
	private double x;
	
	@Column(name="last_updated")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;

	public DirectorName() {
		super();

	}

	public DirectorName(int id, String firstName, String secondName, boolean isPopular, double x, Date addedDate,
			byte[] image) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.isPopular = isPopular;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public boolean isPopular() {
		return isPopular;
	}

	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "DirectorName [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", isPopular="
				+ isPopular + ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}

}
