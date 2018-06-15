package ec.com.technoloqie.conference.percistence.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.model.dto.SessionDTO;
import ec.com.technoloqie.conference.model.dto.TrackDTO;
import ec.com.technoloqie.conference.percistence.dao.IConferenceDAO;

public class ConferenceDAO implements IConferenceDAO{

	public Collection<SessionDTO> searchSessions() throws ConferenceException {
		Collection<SessionDTO> colSessionDTO = new ArrayList<SessionDTO>();
		
		DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		try {
			SessionDTO session1 = new SessionDTO();
			session1.setId(1);
			session1.setName("Morning");
			Date dateStart = formatter.parse("09:00:00");
			session1.setStartHour(dateStart);
			Date dateFinish;
			dateFinish = formatter.parse("12:00:00");
			session1.setStartHour(dateStart);
			session1.setFinishHour(dateFinish);
			colSessionDTO.add(session1);
			
			SessionDTO session2 = new SessionDTO();
			session2.setId(1);
			session2.setName("Afernon");
			dateStart = formatter.parse("13:00:00");
			session2.setStartHour(dateStart);
			dateFinish = formatter.parse("16:00:00");
			session2.setStartHour(dateStart);
			session2.setFinishHour(dateFinish);
			colSessionDTO.add(session2);
		} catch (Exception e) {
			throw new ConferenceException("Error al buscar sesiones",e);
		}
		
		return colSessionDTO;
	}

	public Collection<TrackDTO> searchTracks() throws ConferenceException {
		// TODO Auto-generated method stub
		return null;
	}

}
