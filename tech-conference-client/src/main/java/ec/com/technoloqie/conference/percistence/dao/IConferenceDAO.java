package ec.com.technoloqie.conference.percistence.dao;

import java.util.Collection;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.model.dto.SessionDTO;
import ec.com.technoloqie.conference.model.dto.TrackDTO;

public interface IConferenceDAO {
	
	Collection<SessionDTO> searchSessions() throws ConferenceException;
	
	Collection<TrackDTO> searchTracks() throws ConferenceException;

}
