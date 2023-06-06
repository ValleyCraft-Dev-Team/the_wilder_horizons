package net.linkle.wilder_horizons.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class AlphaModItem extends Item {

    private final ArrayList<Text> texts = new ArrayList<>();

    public AlphaModItem(Settings settings) {
        super(settings);
    }

    /** Append text to tooltip.
     * @see AlphaModItem#addText(String, Formatting)
     * @param trans translatable text. */
    public AlphaModItem addText(String trans) {
        return addText(trans, Formatting.GRAY);
    }

    /** Append text to tooltip.
     * @see AlphaModItem#addText(Text)
     * @param trans translatable text. */
    public AlphaModItem addText(String trans, Formatting format) {
        return addText(Text.translatable(trans).formatted(format));
    }

    /** Append text to tooltip. */
    public AlphaModItem addText(Text text) {
        texts.add(text);
        return this;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.addAll(texts);
    }
}
