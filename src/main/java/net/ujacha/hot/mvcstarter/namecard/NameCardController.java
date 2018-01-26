package net.ujacha.hot.mvcstarter.namecard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("namecards")
public class NameCardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NameCardController.class);

    @Autowired
    private NameCardService nameCardService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String page(Model model){

        List<NameCard> nameCards= nameCardService.getAllNameCards();

        LOGGER.debug("nameCards : ", nameCards);

        model.addAttribute("nameCards", nameCards);

        return "namecard/index";
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<NameCard> getAll(){

        List<NameCard> nameCards = nameCardService.getAllNameCards();
        return nameCards;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody NameCard getOne(@PathVariable long id){

        NameCard nameCard = new NameCard(id);

        nameCard = nameCardService.getNameCard(nameCard);

        return nameCard;
    }


}
