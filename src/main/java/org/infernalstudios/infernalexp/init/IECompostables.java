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

package org.infernalstudios.infernalexp.init;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.ItemLike;

public class IECompostables {

    public static void register() {
        registerCompostable(IEBlocks.CRIMSON_FUNGUS_CAP.get(), 1.0F);
        registerCompostable(IEBlocks.LUMINOUS_FUNGUS.get(), 0.45F);
        registerCompostable(IEBlocks.LUMINOUS_FUNGUS_CAP.get(), 1.0F);
        registerCompostable(IEBlocks.SHROOMLIGHT_FUNGUS.get(), 0.65F);
        registerCompostable(IEBlocks.WARPED_FUNGUS_CAP.get(), 1.0F);
    }

    private static void registerCompostable(ItemLike item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

}
