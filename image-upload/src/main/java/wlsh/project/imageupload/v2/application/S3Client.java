package wlsh.project.imageupload.v2.application;

import wlsh.project.imageupload.v2.application.dto.PresignedUrlRequestDto;

public interface S3Client {
    String getPresignedPutUrl(PresignedUrlRequestDto presignedUrlRequestDto);
}
