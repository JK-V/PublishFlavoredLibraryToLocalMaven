package com.sdk.library;

/**
 *
 */

interface AuthenticationManagerInternalContract {
    /**
     * Main-Flavour Doc
     * Handles Pin authentication mechanism
     */
    void pinAuthentication();

    /**
     * Main-Flavour Doc
     * Handles fingerprint authentication mechanism
     */
    void fingerprintAuthentication();

    void patternAuthentication();

    //Below two are only accessible to privileged users
    void retinaAuthentication();

    void faceAuthentication();
}
