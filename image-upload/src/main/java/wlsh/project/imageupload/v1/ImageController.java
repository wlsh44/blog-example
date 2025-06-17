package wlsh.project.imageupload.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ImageController {

    private final FileService fileService;

    @PostMapping(path = "/image/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadImage(@RequestPart("file") MultipartFile file) {
        log.info("file.getOriginalFileName {}", file.getOriginalFilename());
        log.info("file.getName {}", file.getName());
        log.info("file.getContentType {}", file.getContentType());
        log.info("file.getSize {}", file.getSize());
        return fileService.getPreSignedUrl("prefix", file.getOriginalFilename());
    }
}
