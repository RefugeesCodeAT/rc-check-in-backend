package at.refugeescode.checkin.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.Duration;
import java.time.LocalDateTime;

@Projection(name = "log", types = Checkin.class)
public interface CheckinProjection {

    boolean isCheckedIn();

    boolean isAuto();

    LocalDateTime getTime();

    @Value("#{@checkinService.getDuration(target)}")
    Duration getDuration();

    @Value("#{target.person.name}")
    String getName();

}