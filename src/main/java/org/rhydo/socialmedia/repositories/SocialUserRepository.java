package org.rhydo.socialmedia.repositories;

import org.rhydo.socialmedia.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository  extends JpaRepository<SocialUser, Long> {
}
