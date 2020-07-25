package com.restfulBootstrapApi.awsimageupload.datastore;

import com.restfulBootstrapApi.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("31bdf54d-1e73-465d-a0c7-61452fef9c9b"), "jeremiahjenkins", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("7c39bd9e-1369-4fbd-888a-453b08a9f6b3"), "andersonmister", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
