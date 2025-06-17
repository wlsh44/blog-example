package wlsh.project.imageupload.v2.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wlsh.project.imageupload.v2.application.ImageService;
import wlsh.project.imageupload.v2.presentation.dto.PresignedUrlRequest;
import wlsh.project.imageupload.v2.presentation.dto.PresignedUrlResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    @PostMapping(value = "/upload")
    public ResponseEntity<PresignedUrlResponse> createPresignedUrl(@RequestBody PresignedUrlRequest request) {
        PresignedUrlResponse response = imageService.getPresignedUrl(request);
        return ResponseEntity.ok(response);
    }
}
