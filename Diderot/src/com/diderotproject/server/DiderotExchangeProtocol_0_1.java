package com.diderotproject.server;

import java.security.PublicKey;

import com.diderotproject.common.note.Note;
import com.diderotproject.common.serverResponse;
import com.diderotproject.common.trustList;

public interface DiderotExchangeProtocol_0_1 {
	
	serverResponse RegisterNym( PublicKey key, String name );
	
	serverResponse QueryKeyword( String keyword, trustList tl );
	
	serverResponse SubmitNote( Note n );

}
