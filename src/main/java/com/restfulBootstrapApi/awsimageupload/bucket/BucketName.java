package com.restfulBootstrapApi.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMG("kieran-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
