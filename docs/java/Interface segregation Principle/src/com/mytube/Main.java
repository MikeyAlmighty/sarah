package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(
            new VideoEncoder2022(),
            new VideoDatabase2022(),
            new EmailService2022()
        );
        processor.process(video);
    }
}
