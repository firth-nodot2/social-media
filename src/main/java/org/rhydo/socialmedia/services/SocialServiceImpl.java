package org.rhydo.socialmedia.services;

import lombok.RequiredArgsConstructor;
import org.rhydo.socialmedia.models.SocialUser;
import org.rhydo.socialmedia.repositories.SocialUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SocialServiceImpl implements SocialService {
    private final SocialUserRepository socialUserRepository;

    @Override
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    @Override
    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    @Override
    public void deleteUser(Long userId) {
        SocialUser socialUser = socialUserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        socialUserRepository.delete(socialUser);
    }

}
