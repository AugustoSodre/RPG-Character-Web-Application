package augusto.first_api.character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<RPGCharacter, Integer> {
        List<RPGCharacter> characters = List.of();


    //Create
    public default void addCharacter(RPGCharacter character) {
        characters.add(character);
    }

    //Read
    public default List<RPGCharacter> getCharacters() {
        return characters;
    }

    //Update
    public default void updateCharacter(RPGCharacter character) {
        characters.set(characters.indexOf(character), character);
    }

    //Delete
}
