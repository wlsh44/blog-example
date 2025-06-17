package wlsh.project.imageupload.v2.application;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ImageNameGenerator {

    public String generate() {
        return UUID.randomUUID().toString();
    }
}
