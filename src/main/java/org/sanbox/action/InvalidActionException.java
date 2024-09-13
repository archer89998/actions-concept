package org.sanbox.action;

import lombok.extern.slf4j.Slf4j;

/**
 * Provides throw and log InvalidActionException
 */
@Slf4j
public class InvalidActionException extends RuntimeException {

    InvalidActionException(String message, String... args) {
        super(String.format(message, args));
        log.error(String.format(message, args));
    }
}
