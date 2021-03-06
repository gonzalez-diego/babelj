package com.pragmabits.utils;

/**
 * The interface Clipboard handler.
 */
public interface ClipboardHandler {

    /**
     * Gets text by input type (clipboard or selection).
     *
     * @param inputType the input type
     * @return the by input type
     * @throws ClipboardManagerError the clipboard error
     */
    String getByInputType(String inputType) throws ClipboardManagerError;

    /**
     * Sets clipboard to given text.
     *
     * @param targetText the target text
     */
    boolean setClipboard(String targetText) throws ClipboardManagerError;
}
