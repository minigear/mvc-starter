package net.ujacha.hot.mvcstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    public static final Logger log =  LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private Environment env;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        log.debug("INDEX");

        // Environment 이용
        String[] profiles = env.getActiveProfiles();
        for(String profile : profiles){
            log.debug( profile );
        }
        log.debug("{} / {}", profiles, profiles.length);

        profiles = env.getDefaultProfiles();
        for(String profile : profiles){
            log.debug( profile );
        }
        log.debug("{} / {}", profiles, profiles.length);


        model.addAttribute("message", "Hello Spring MVC Starter!!!!");

        return "index";
    }


}
