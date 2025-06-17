package wlsh.project.imageupload.v2.presentation.dto;

public record PresignedUrlResponse(
        String signedUploadPutUrl,
        String signedGetUrl,
        String assetUrl
) {
}
