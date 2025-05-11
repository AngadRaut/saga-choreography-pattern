package com.common_dto.events;

import java.util.Date;
import java.util.UUID;

public interface Event {
    Date getDate();
    UUID getEventId();
}
