package ec.com.technoloqie.conference.model.dto;


@SuppressWarnings("serial")
//@Entity
//@Table(name="CONFERENCE")
public class ConferenceDTO {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="ID_CONFERENCE",nullable=false, unique=true)*/
	private Integer id;

	//@Column(name="NOMBRE")
	private String name;

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


}
