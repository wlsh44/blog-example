package wlsh.project.imageupload.v2.presentation.dto;

public record PreSignedResponse(
        String preSignedUrl,
        String fileName
) {}
