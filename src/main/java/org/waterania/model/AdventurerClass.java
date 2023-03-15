package org.waterania.model;

import java.util.HashMap;
import java.util.Map;

public class AdventurerClass {

    public Map<WeaponTypes, Integer> proficientcies = new HashMap<>();
    public Map<WeaponTypes, Spell> spells = new HashMap<>();

    public AdventurerClass(Map<WeaponTypes, Integer> proficientcies, Map<WeaponTypes, Spell> spells) {
        this.proficientcies = proficientcies;
        this.spells = spells;
    }

}
