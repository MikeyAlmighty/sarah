package com.mytube;

public class VideoProcessor {
    // Interfaces
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;

    // Constructor Injection
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

