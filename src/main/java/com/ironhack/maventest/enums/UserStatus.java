package com.ironhack.maventest.enums;

public enum UserStatus {
    ONLINE, OFFLINE, INACTIVE, BANNED;

    public String getTranslation() {
        String translatedValue = "";

        switch (this) {
            case OFFLINE:
                translatedValue = "Desconectado";
                break;
            case BANNED:
                translatedValue = "Baneado :C";
                break;
            case INACTIVE:
                translatedValue = "Inactivo";
                break;
            case ONLINE:
                translatedValue = "En línea :D";
                break;
            default:
                translatedValue = "Error";
                break;
        }

        return translatedValue;

    }

}
