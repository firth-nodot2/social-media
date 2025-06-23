package org.rhydo.socialmedia.repositories;

import org.rhydo.socialmedia.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long> {
}
