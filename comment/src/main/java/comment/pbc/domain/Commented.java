package comment.pbc.domain;

import comment.pbc.domain.*;
import comment.pbc.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Commented extends AbstractEvent {

    private Long topicId;
    private String userId;
    private String replyId;
    private String profileImg;
    private String comment;
    private Date timeStamp;

    public Commented(Commentary aggregate) {
        super(aggregate);
    }

    public Commented() {
        super();
    }
}
