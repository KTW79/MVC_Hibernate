package pl.javastart.minifilmweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by Kasia on 10.03.2017.
 */

@Controller
public class ActorController {

    private ActorRepository actorRepository;


    @GetMapping("/")
    public String actorList(Model model){
        List<Actor> actors = actorRepository.findAll();
        model.addAttribute("actors",actors);
        return "actors";
    }

    @GetMapping("/add")
    public String addActor(Model model){
        model.addAttribute("actor",new Actor());
        model.addAttribute("date of birth", new Date());
        return "addFormActors";

    }

    @PostMapping("/add")
    public String addFormActors(Actor actor){
       actorRepository.save(actor);
       return "redirect:/";
    }

    @GetMapping("/actors")
    public String actorDetails(Model model, @RequestParam Long id){
        Actor actor = actorRepository.findOne(id);
        model.addAttribute("actor",actor);
        return "actorDetails";
    }
}
