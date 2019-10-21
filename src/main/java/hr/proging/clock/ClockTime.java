package hr.proging.clock;

import java.time.Clock;
import java.time.Duration;

public class ClockTime {

	public static Clock clock = Clock.systemDefaultZone();

	public static void incrementHours() {
		clock = Clock.offset(clock, Duration.ofHours(1));
	}

	public static void incrementMinutes() {
		clock = Clock.offset(clock, Duration.ofMinutes(1));
	}

	public static void incrementSeconds() {
		clock = Clock.offset(clock, Duration.ofSeconds(1));
	}

}
