package ec.com.technoloqie.conference.gestor;

import java.util.Collection;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.model.dto.SessionDTO;
import ec.com.technoloqie.conference.model.dto.TrackDTO;

public interface IConferenceGestor {
	
	Collection<SessionDTO> searchSessions() throws ConferenceException;
	
	Collection<TrackDTO> searchTracks() throws ConferenceException;
}
