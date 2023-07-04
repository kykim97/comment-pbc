package comment.pbc.infra;
import comment.pbc.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/commentaries")
@Transactional
public class CommentaryController {
    @Autowired
    CommentaryRepository commentaryRepository;




    @RequestMapping(value = "commentaries/",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public Commentary comment(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /commentary/comment  called #####");
            commentary.comment();
            commentaryRepository.save(commentary);
            return commentary;
    }

}
