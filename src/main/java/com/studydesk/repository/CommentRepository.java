package com.studydesk.repository;

import com.studydesk.Model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Long> {
      Page<Comment> findByForoId(Long foroId, Pageable pageable);
      Optional<Comment> findByIdAndForoId(Long id,Long foroId);
}
