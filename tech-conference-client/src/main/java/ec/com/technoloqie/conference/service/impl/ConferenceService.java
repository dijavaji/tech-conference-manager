package ec.com.technoloqie.conference.service.impl;

import java.util.Collection;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.gestor.IConferenceGestor;
import ec.com.technoloqie.conference.gestor.impl.ConferenceGestor;
import ec.com.technoloqie.conference.model.dto.SessionDTO;
import ec.com.technoloqie.conference.model.dto.TalkDTO;
import ec.com.technoloqie.conference.model.dto.TrackDTO;
import ec.com.technoloqie.conference.service.IConferenceService;

public class ConferenceService implements IConferenceService{
	
	private IConferenceGestor conferenceGestor;
	
	public void asignedTalks(TalkDTO talkDTO) throws ConferenceException {
		setConferenceGestor(new ConferenceGestor());
		
	}

	public IConferenceGestor getConferenceGestor() {
		return conferenceGestor;
	}

	public void setConferenceGestor(IConferenceGestor conferenceGestor) {
		this.conferenceGestor = conferenceGestor;
	}

	public Collection<SessionDTO> searchSessions() throws ConferenceException {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<TrackDTO> searchTracks() throws ConferenceException {
		// TODO Auto-generated method stub
		return null;
	}

}
