/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.fluid.system;

import org.terasology.math.geom.Rect2i;
import org.terasology.rendering.assets.texture.TextureRegion;
import org.terasology.rendering.nui.Canvas;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
public class TextureFluidRenderer implements FluidRenderer {
    private TextureRegion texture;
    private String fluidName;

    public TextureFluidRenderer(TextureRegion texture, String fluidName) {
        this.texture = texture;
        this.fluidName = fluidName;
    }

    @Override
    public TextureRegion getTexture() {
        return texture;
    }

    @Override
    public void renderFluid(Canvas canvas, Rect2i region) {
        canvas.drawTexture(texture, region);
    }

    @Override
    public String getFluidName() {
        return fluidName;
    }
}
