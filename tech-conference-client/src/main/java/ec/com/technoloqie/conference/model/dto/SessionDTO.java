package ec.com.technoloqie.conference.model.dto;

import java.util.Date;

public class SessionDTO {
	
	private Integer id;

	private String name;
	
	private Date startHour;
	
	private Date finishHour;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartHour() {
		return startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	public Date getFinishHour() {
		return finishHour;
	}

	public void setFinishHour(Date finishHour) {
		this.finishHour = finishHour;
	}

}
