package org.sanbox.check;

import lombok.extern.slf4j.Slf4j;

/**
 * Provides throw and log InvalidActionException
 */
@Slf4j
public class InvalidCheckException extends RuntimeException {

    InvalidCheckException(String message, String... args) {
        super(String.format(message, args));
        log.error(String.format(message, args));
    }
}
