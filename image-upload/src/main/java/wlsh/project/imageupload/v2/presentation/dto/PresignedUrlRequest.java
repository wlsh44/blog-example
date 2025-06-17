package wlsh.project.imageupload.v2.presentation.dto;

public record PresignedUrlRequest(
        Long contentLength,
        String contentType
) {
}
