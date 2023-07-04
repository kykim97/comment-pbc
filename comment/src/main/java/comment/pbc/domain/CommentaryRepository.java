package comment.pbc.domain;

import comment.pbc.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "commentaries",
    path = "commentaries"
)
public interface CommentaryRepository
    extends PagingAndSortingRepository<Commentary, Long> {}
