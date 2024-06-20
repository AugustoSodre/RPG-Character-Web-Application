package augusto.first_api.character;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "rpg_character")
public class RPGCharacter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer char_id;
    @Column
    private Integer char_age;
    @Column
    private String char_height;
    @Column
    private String char_name;
    @Column
    private String char_race;
    @Column
    private String char_class;
    @Column
    private String char_gender;
    @Column
    private Boolean char_is_dead;

    public RPGCharacter(Integer charId, Integer charAge, String charHeight, String charName, String charRace, String charClass, String charGender, Boolean charIsDead) {
        char_id = charId;
        char_age = charAge;
        char_height = charHeight;
        char_name = charName;
        char_race = charRace;
        char_class = charClass;
        char_gender = charGender;
        char_is_dead = charIsDead;
    }

        public RPGCharacter() {

        }

    public Integer char_id() {
        return char_id;
    }

    public Integer char_age() {
        return char_age;
    }

    public String char_height() {
        return char_height;
    }

    public String char_name() {
        return char_name;
    }

    public String char_race() {
        return char_race;
    }

    public String char_class() {
        return char_class;
    }

    public String char_gender() {
        return char_gender;
    }

    public Boolean char_is_dead() {
        return char_is_dead;
    }

}
