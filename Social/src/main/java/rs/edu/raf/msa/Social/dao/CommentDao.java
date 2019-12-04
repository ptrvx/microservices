package rs.edu.raf.msa.Social.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.edu.raf.msa.Social.domain.model.Comment;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {

    public Comment getById(Long id);

    public List<Comment> getCommentsByPostIdOrderByDatetimeDesc(Long id);

}
