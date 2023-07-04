package comment.pbc.domain;

import comment.pbc.CommentApplication;
import comment.pbc.domain.Commented;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Commentary_table")
@Data
public class Commentary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long topicId;

    private String userId;

    private String replyId;

    private String profileImg;

    private String comment;

    private Date timeStamp;

    @PostPersist
    public void onPostPersist() {
        Commented commented = new Commented(this);
        commented.publishAfterCommit();
    }

    public static CommentaryRepository repository() {
        CommentaryRepository commentaryRepository = CommentApplication.applicationContext.getBean(
            CommentaryRepository.class
        );
        return commentaryRepository;
    }

    public void comment(CommentCommand commentCommand) {
        Commented commented = new Commented(this);
        commented.publishAfterCommit();
    }
}
