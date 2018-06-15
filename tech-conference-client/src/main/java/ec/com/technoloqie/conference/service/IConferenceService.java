package ec.com.technoloqie.conference.service;

import ec.com.technoloqie.conference.exception.ConferenceException;
import ec.com.technoloqie.conference.model.dto.TalkDTO;


public interface IConferenceService {
	
	void asignedTalks(TalkDTO talkDTO) throws ConferenceException;
}
