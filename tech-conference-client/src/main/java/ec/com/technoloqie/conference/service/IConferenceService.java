package ec.com.technoloqie.conference.service;

import java.util.Collection;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.model.dto.SessionDTO;
import ec.com.technoloqie.conference.model.dto.TalkDTO;
import ec.com.technoloqie.conference.model.dto.TrackDTO;


public interface IConferenceService {
	
	void asignedTalks(TalkDTO talkDTO) throws ConferenceException;
	
	Collection<SessionDTO> searchSessions() throws ConferenceException;
	
	Collection<TrackDTO> searchTracks() throws ConferenceException;
}
