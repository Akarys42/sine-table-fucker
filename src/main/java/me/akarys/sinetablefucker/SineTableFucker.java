package me.akarys.sinetablefucker;

import me.akarys.sinetablefucker.mixin.MathHelperMixin;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class SineTableFucker implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("sine-table-fucker");

	@Override
	public void onInitialize() {
		Random rand = new Random();

		for (int i = 0; i < MathHelperMixin.getSINE_TABLE().length; i++) {
			MathHelperMixin.getSINE_TABLE()[i] += (float) (rand.nextDouble() - 0.5);
		}

		LOGGER.info("lol");
	}
}