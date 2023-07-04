package comment.pbc.infra;

import comment.pbc.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CommentaryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Commentary>> {

    @Override
    public EntityModel<Commentary> process(EntityModel<Commentary> model) {
        return model;
    }
}
