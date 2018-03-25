package com.sdk.library;

/**
 *
 */

class DefaultAuthenticationManager implements AuthenticationManager {

    private AuthenticationManagerInternalContract mAuthenticationManagerContract;

    public DefaultAuthenticationManager() {
        mAuthenticationManagerContract = new AuthenticationManagerInternal();
    }

    public void pinAuthentication() {
        mAuthenticationManagerContract.pinAuthentication();
    }

    public void fingerprintAuthentication() {
        mAuthenticationManagerContract.fingerprintAuthentication();
    }

    public void patternAuthentication() {
        mAuthenticationManagerContract.patternAuthentication();
    }
}
