package wlsh.project.imageupload.v2.application.dto;

public record PresignedUrlRequestDto(
        String contentType,
        Long contentLength,
        String assetUrl
) {
}
