package com.studydesk.repository;

import com.studydesk.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
    Optional<Profile> findByIdAndUserId(Long id, Long userId);
}
