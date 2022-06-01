/*
 * Copyright 2022 Infernal Studios
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.infernalstudios.infernalexp.world.dimension;

import net.minecraft.core.Registry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.newbiome.context.Context;
import net.minecraft.world.level.newbiome.layer.traits.AreaTransformer0;

public class ModNetherMasterLayer implements AreaTransformer0 {

    private final Registry<Biome> dynamicRegistry;

    public ModNetherMasterLayer(long seed, Registry<Biome> dynamicRegistry) {
        this.dynamicRegistry = dynamicRegistry;
    }

    @Override
    public int applyPixel(Context context, int x, int y) {
        return ModNetherBiomeCollector.getRandomNetherBiomes(context, this.dynamicRegistry);
    }
}