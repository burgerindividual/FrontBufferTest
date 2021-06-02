package net.fabricmc.example;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.lwjgl.opengl.GL11;

public class BufferInitializer implements PreLaunchEntrypoint {
	@Override
	public void onPreLaunch() {
		RenderSystem.recordRenderCall(() -> GL11.glDrawBuffer(GL11.GL_FRONT_LEFT));
	}
}
