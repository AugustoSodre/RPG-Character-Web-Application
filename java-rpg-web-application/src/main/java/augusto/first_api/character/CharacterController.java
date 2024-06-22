package augusto.first_api.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @PostMapping("/characters/post")
    public void post(@RequestBody RPGCharacter character) {
        characterRepository.addCharacter(character);
    }

    @GetMapping("/characters/{id}")
    public Optional<Character> findById(@PathVariable Integer id) {
        return characterRepository.findById(id);
    }

    @PutMapping("/characters/update/{id}")
    public void update(@PathVariable Integer id, @RequestBody RPGCharacter character) {
        characterRepository.updateCharacter(id, character);
    }

    @GetMapping("/characters")
    public List<Character> findAll() {
        return characterRepository.findAll();
    }

    @DeleteMapping("/characters/delete/{id}")
    public void delete(@PathVariable Integer id) {
        characterRepository.deleteById(id);
    }


}
