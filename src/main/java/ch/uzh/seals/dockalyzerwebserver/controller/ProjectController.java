package ch.uzh.seals.dockalyzerwebserver.controller;


import ch.uzh.ifi.seal.dockalyzer.App;
import ch.uzh.ifi.seal.dockalyzer.models.Project;
import ch.uzh.seals.dockalyzerwebserver.domain.ProjectDTO;
import ch.uzh.seals.dockalyzerwebserver.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.File;

@RestController
@RequestMapping("/")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @RequestMapping
    public Project findAll() throws Exception {
        App app = new App("http://github.com/probr/probr-core");
        return app.getProjectFromGitUrl();
    }

    @RequestMapping("/project")
    @ResponseBody
    public Project findOne(@RequestParam("gitUrl") String gitUrl) throws Exception {
    //   ObjectMapper mapper = new ObjectMapper();
      //  ObjectReader reader = mapper.reader(Project.class);
      //  Project test = reader.with(DeserializationFeature.READ_ENUMS_USING_TO_STRING).readValue(new File("C:\\Users\\saliz\\dev\\backend\\dockalyzer-webserver\\test.json"));
   //     return test;

       App app = new App(gitUrl);
       return app.getProjectFromGitUrl();
     // return projectService.findOne(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveOrUpdate(@Valid @RequestBody ProjectDTO project) {
        projectService.saveOrUpdate(project);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        projectService.delete(id);
    }

}