package augusto.first_api.character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
    List<RPGCharacter> characters = new ArrayList<>();

    default void addCharacter(RPGCharacter character) {
        characters.add(character);
    }

    default RPGCharacter findById(int id) {
        for (RPGCharacter character : characters) {
            if (character.getChar_id() == id){
                return character;
            }
        }
        return null;
    }

    default void updateCharacter(Integer id, RPGCharacter character) {
        characters.set(id, character);
    }

}
