package net.linkle.wilder_horizons.environment.sounds;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHSounds implements IdProvider {
    
    SPRINKLER,
    
    CURTAIN_OPEN,
    CURTAIN_CLOSE,
    
    POT_BREAK, 
    DUCK_QUACK;

    public static void initialize() {
    }
    
    
    // ### The Enum Class Itself ###
    
    public final SoundEvent sound;
    
    private WHSounds() {
        sound = new SoundEvent(Main.makeId(name().toLowerCase(Locale.ROOT)));
        Registry.register(Registry.SOUND_EVENT, sound.getId(), sound);
    }
    
    private WHSounds(String path) {
        sound = new SoundEvent(Main.makeId(path));
        Registry.register(Registry.SOUND_EVENT, sound.getId(), sound);
    }

    @Override
    public Identifier getId() {
        return sound.getId();
    }
}
