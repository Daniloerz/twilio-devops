package com.twiliopowerup.twiliopowerup.application.handler;

import com.twiliopowerup.twiliopowerup.application.dto.request.MessageRequestDto;

public interface ITwilioHandler {
    Boolean sendMessage (MessageRequestDto messageRequestDto);
}
