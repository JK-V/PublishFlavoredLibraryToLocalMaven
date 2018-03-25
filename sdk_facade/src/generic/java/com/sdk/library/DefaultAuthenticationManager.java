package com.sdk.library;

import android.util.Log;

import com.sdk.core.Device;

import java.lang.annotation.Target;

/**
 *
 */

class DefaultAuthenticationManager implements AuthenticationManager {

    private AuthenticationManagerInternalContract mAuthenticationManagerContract;

    public DefaultAuthenticationManager() {
        mAuthenticationManagerContract = new AuthenticationManagerInternal();
    }

    /**
     * GenericImp-Flavour Doc
     * Handles Pin authentication mechanism
     */
    public void pinAuthentication() {
        mAuthenticationManagerContract.pinAuthentication();
    }

    /**
     * GenericImp-Flavour Doc
     * Handles fingerprint authentication mechanism
     */
    public void fingerprintAuthentication() {
        mAuthenticationManagerContract.fingerprintAuthentication();
    }

    public void patternAuthentication() {
        mAuthenticationManagerContract.patternAuthentication();
    }

    public void retinaAuthentication() {
        mAuthenticationManagerContract.retinaAuthentication();
    }

    public void faceAuthentication() {
        mAuthenticationManagerContract.faceAuthentication();
    }
}
