package com.hotel.ds_backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.hotel.ds_backend.model.SmsPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component

public class SMSService {

    private final String ACCOUNT_SID ="ACfc5e036c2089eef1bb82b992b2a25771";

	    private final String AUTH_TOKEN = "c1c0f128e4a23ff6d9861210291df2ab";

	    private final String FROM_NUMBER = "enter the phone number generated from Twilio";

	    public void send(SmsPojo sms) {
	    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), "Payment is Successfull...")
	                .create();
	        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

	    }

	    public void receive(MultiValueMap<String, String> smscallback) {
	    }

}
