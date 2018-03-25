package com.sdk.library;

/**
 * Generic-Flavor : Authentication Manager Contract
 */

public interface AuthenticationManager {

    /**
     * Generic-Flavour Doc
     * Handles Pin authentication mechanism
     */
    void pinAuthentication();

    /**
     * Generic-Flavour Doc
     * Handles fingerprint authentication mechanism
     */
    void patternAuthentication();

    //Below two are only accessible to privileged users
    void retinaAuthentication();

    void faceAuthentication();
}
