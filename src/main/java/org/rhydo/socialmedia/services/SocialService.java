package org.rhydo.socialmedia.services;

import org.rhydo.socialmedia.models.SocialUser;

import java.util.List;

public interface SocialService {
    List<SocialUser> getAllUsers();

    SocialUser saveUser(SocialUser socialUser);

    void deleteUser(Long userId);
}
