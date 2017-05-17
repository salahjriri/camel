package sample.camel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;
@Entity
@Table(name = "execution")
public class DateExc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String datxc;
	

	@Id
    @GeneratedValue
    @Column(name = "IDENTIFIANT")
	public Integer getDateId() {
		return id;
	}
	public void setDateId(Integer userId) {
		this.id = userId;
	}
	
	@Column(name = "DATEEXEC")
	public String getExcDate() {
		return datxc;
	}
	public void setExcDate(String date_exc) {
		this.datxc = date_exc;
	}
	
	
	
}
