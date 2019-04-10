package newtest.newton.resource;

import newtest.newton.model.vanpool_user;
import newtest.newton.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "/all")
    public List<vanpool_user> getAll(){
        return userRepository.findAll();
    }


    @PostMapping(value = "/load")
    public List<vanpool_user> persist(@RequestBody final vanpool_user users){
        userRepository.save(users);
        return userRepository.findAll();
    }
}
