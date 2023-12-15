package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repo.Userrepository;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    private Userrepository userrepository;
}
