package com.example.wilder.myapplicationphotos;

import android.net.Uri;

/**
 * Created by wilder on 21/03/17.
 */

public class User {
    private String pseudo;
    private String mail;
    private Uri profileUri;

    public User(String pseudo, String mail, Uri profileUri) {
        this.pseudo = pseudo;
        this.mail = mail;
        this.profileUri = profileUri;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMail() {
        return mail;
    }

    public Uri getProfileUri() {
        return profileUri;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setProfileUri(Uri profileUri) {
        this.profileUri = profileUri;
    }
}
