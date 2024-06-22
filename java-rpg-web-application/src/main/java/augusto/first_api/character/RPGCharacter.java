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

    public Integer getChar_id() {
        return char_id;
    }

    public void setChar_id(Integer char_id) {
        this.char_id = char_id;
    }

    public Integer getChar_age() {
        return char_age;
    }

    public void setChar_age(Integer char_age) {
        this.char_age = char_age;
    }

    public String getChar_height() {
        return char_height;
    }

    public void setChar_height(String char_height) {
        this.char_height = char_height;
    }

    public String getChar_name() {
        return char_name;
    }

    public void setChar_name(String char_name) {
        this.char_name = char_name;
    }

    public String getChar_race() {
        return char_race;
    }

    public void setChar_race(String char_race) {
        this.char_race = char_race;
    }

    public String getChar_class() {
        return char_class;
    }

    public void setChar_class(String char_class) {
        this.char_class = char_class;
    }

    public String getChar_gender() {
        return char_gender;
    }

    public void setChar_gender(String char_gender) {
        this.char_gender = char_gender;
    }

    public Boolean getChar_is_dead() {
        return char_is_dead;
    }

    public void setChar_is_dead(Boolean char_is_dead) {
        this.char_is_dead = char_is_dead;
    }
}
