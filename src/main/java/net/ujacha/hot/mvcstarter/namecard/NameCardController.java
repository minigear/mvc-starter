package net.ujacha.hot.mvcstarter.namecard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("namecards")
public class NameCardController {

//    @Autowired
//    private NameCardService nameCardService;

    @RequestMapping(name = "", method = RequestMethod.GET)
    public String page(){
        return "namecard/index";
    }

    @RequestMapping(name = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody NameCard get(){

//        NameCard nameCard = new NameCard();
//
//        nameCard.setId(1);
//
//        nameCard = nameCardService.getNamecard(nameCard);

        return null;
    }


}
