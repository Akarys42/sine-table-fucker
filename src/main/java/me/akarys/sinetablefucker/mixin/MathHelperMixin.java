package me.akarys.sinetablefucker.mixin;

import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MathHelper.class)
public interface MathHelperMixin {
	@Accessor
	static float[] getSINE_TABLE() { throw new IllegalStateException("Mixin injection failed."); }
}