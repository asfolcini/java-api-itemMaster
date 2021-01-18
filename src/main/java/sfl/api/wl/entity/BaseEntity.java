package sfl.api.wl.entity;

import java.util.Calendar;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
public class BaseEntity {
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar onCreate;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar onUpdate;

	public Calendar getOnCreate() {
		return onCreate;
	}

	public void setOnCreate(Calendar onCreate) {
		this.onCreate = onCreate;
	}

	public Calendar getOnUpdate() {
		return onUpdate;
	}

	public void setOnUpdate(Calendar onUpdate) {
		this.onUpdate = onUpdate;
	}

	
}
