package za.co.web.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testGitHub/user")
public class UserQueryRestController {

    @RequestMapping(value = "/input/{id}", method = GET)
    public String triggerCron(@PathVariable("id") final String id) {
        return "You supplied value of:"+ id;
    }
}
