package augusto.first_api;

import augusto.first_api.character.CharacterRepository;
import augusto.first_api.character.RPGCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {

    private final CharacterRepository characterRepository;

    public StartApplication(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        RPGCharacter character = new RPGCharacter(
                1,
                15,
                "1,85",
                "Alex",
                "Elf",
                "Wizard",
                "Male",
                false
        );
        characterRepository.save(character);

        RPGCharacter character2 = new RPGCharacter(
                4,
                20,
                "1,90",
                "Ferrari",
                "Dwarf",
                "Bard",
                "Male",
                true
        );
        characterRepository.save(character2);

        for (RPGCharacter rpgCharacter : characterRepository.findAll()) {
            System.out.println(rpgCharacter.char_id());
        }


    }
}
