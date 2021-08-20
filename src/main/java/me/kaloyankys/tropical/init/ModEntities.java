package me.kaloyankys.tropical.init;

import me.kaloyankys.tropical.entity.CocoCrabEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<CocoCrabEntity> COCONUT_CRAB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("tropical", "coconut_crab"),
            FabricEntityTypeBuilder.<CocoCrabEntity>create(SpawnGroup.CREATURE,
            (t, w) -> new CocoCrabEntity(w)).dimensions(EntityDimensions.fixed(0.8F, 0.8F)).trackRangeBlocks(12).build());
    

    public ModEntities() {
        FabricDefaultAttributeRegistry.register(COCONUT_CRAB, CocoCrabEntity.createMobAttributes());
    }
}
