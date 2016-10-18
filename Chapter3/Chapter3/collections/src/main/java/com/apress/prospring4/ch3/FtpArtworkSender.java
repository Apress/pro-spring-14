package com.apress.prospring4.ch3;

public class FtpArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // ftp logic here... 
    }

    @Override
    public String getFriendlyName() {
        return "File Transfer Protocol"; 
    }

    @Override
    public String getShortName() {
        return "ftp"; 
    }
}
