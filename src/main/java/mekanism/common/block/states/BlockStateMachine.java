package mekanism.common.block.states;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nonnull;
import mekanism.common.Mekanism;
import mekanism.common.base.IBlockType;
import mekanism.common.base.IFactory.RecipeType;
import mekanism.common.block.BlockMekanismContainer;
import mekanism.common.block.interfaces.IBlockActiveTextured;
import mekanism.common.block.interfaces.IRotatableBlock;
import mekanism.common.config.MekanismConfig;
import mekanism.common.tier.BaseTier;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.property.ExtendedBlockState;
import net.minecraftforge.common.property.IUnlistedProperty;

public class BlockStateMachine extends ExtendedBlockState {

    public static final PropertyBool activeProperty = PropertyBool.create("active");
    public static final PropertyEnum<BaseTier> tierProperty = PropertyEnum.create("tier", BaseTier.class);
    public static final PropertyEnum<RecipeType> recipeProperty = PropertyEnum.create("recipe", RecipeType.class);

    public BlockStateMachine(BlockMekanismContainer block) {
        //TODO: Should tier stay part of blockstate or be extracted into its own block
        super(block, new IProperty[]{BlockStateFacing.facingProperty, activeProperty, tierProperty, recipeProperty}, new IUnlistedProperty[]{});
    }

    public enum MachineBlock {
        MACHINE_BLOCK_1,
        MACHINE_BLOCK_2,
        MACHINE_BLOCK_3;

        PropertyEnum<MachineType> machineTypeProperty;

        public PropertyEnum<MachineType> getProperty() {
            if (machineTypeProperty == null) {
                machineTypeProperty = PropertyEnum.create("type", MachineType.class, input -> input != null && input.typeBlock == this);
            }
            return machineTypeProperty;
        }

        public Block getBlock() {
            return null;
        }
    }

    public enum MachineType implements IStringSerializable, IBlockType {
        ENRICHMENT_CHAMBER,
        OSMIUM_COMPRESSOR,
        COMBINER,
        CRUSHER,
        DIGITAL_MINER,
        BASIC_FACTORY,
        ADVANCED_FACTORY,
        ELITE_FACTORY,
        METALLURGIC_INFUSER,
        PURIFICATION_CHAMBER,
        ENERGIZED_SMELTER,
        TELEPORTER,
        ELECTRIC_PUMP,
        PERSONAL_CHEST,
        CHARGEPAD,
        LOGISTICAL_SORTER,
        ROTARY_CONDENSENTRATOR,
        CHEMICAL_OXIDIZER,
        CHEMICAL_INFUSER,
        CHEMICAL_INJECTION_CHAMBER,
        ELECTROLYTIC_SEPARATOR,
        PRECISION_SAWMILL,
        CHEMICAL_DISSOLUTION_CHAMBER,
        CHEMICAL_WASHER,
        CHEMICAL_CRYSTALLIZER,
        SEISMIC_VIBRATOR,
        PRESSURIZED_REACTION_CHAMBER,
        FLUID_TANK,
        FLUIDIC_PLENISHER,
        LASER,
        LASER_AMPLIFIER,
        LASER_TRACTOR_BEAM,
        QUANTUM_ENTANGLOPORTER,
        SOLAR_NEUTRON_ACTIVATOR,
        OREDICTIONIFICATOR,
        RESISTIVE_HEATER,
        FORMULAIC_ASSEMBLICATOR,
        FUELWOOD_HEATER;

        private static final List<MachineType> VALID_MACHINES = new ArrayList<>();

        static {
            VALID_MACHINES.addAll(Arrays.asList(MachineType.values()));
        }

        public static List<MachineType> getValidMachines() {
            return VALID_MACHINES;
        }

        public static MachineType get(Block block, int meta) {
            return null;
        }

        public static MachineType get(MachineBlock block, int meta) {
            return null;
        }


        public static MachineType get(ItemStack stack) {
            return get(Block.getBlockFromItem(stack.getItem()), stack.getItemDamage());
        }

        @Override
        public String getBlockName() {
            return blockName;
        }

        @Override
        public boolean isEnabled() {
            return MekanismConfig.current().general.machinesManager.isEnabled(this);
        }

        //TODO: Put this as part of IBlockElectric?
        public double getUsage() {
            switch (this) {
                case ENRICHMENT_CHAMBER:
                    return MekanismConfig.current().usage.enrichmentChamber.val();
                case OSMIUM_COMPRESSOR:
                    return MekanismConfig.current().usage.osmiumCompressor.val();
                case COMBINER:
                    return MekanismConfig.current().usage.combiner.val();
                case CRUSHER:
                    return MekanismConfig.current().usage.crusher.val();
                case DIGITAL_MINER:
                    return MekanismConfig.current().usage.digitalMiner.val();
                case METALLURGIC_INFUSER:
                    return MekanismConfig.current().usage.metallurgicInfuser.val();
                case PURIFICATION_CHAMBER:
                    return MekanismConfig.current().usage.purificationChamber.val();
                case ENERGIZED_SMELTER:
                    return MekanismConfig.current().usage.energizedSmelter.val();
                case TELEPORTER:
                    return 12500;
                case ELECTRIC_PUMP:
                    return MekanismConfig.current().usage.electricPump.val();
                case PERSONAL_CHEST:
                    return 30;
                case CHARGEPAD:
                    return 25;
                case LOGISTICAL_SORTER:
                    return 0;
                case ROTARY_CONDENSENTRATOR:
                    return MekanismConfig.current().usage.rotaryCondensentrator.val();
                case CHEMICAL_OXIDIZER:
                    return MekanismConfig.current().usage.oxidationChamber.val();
                case CHEMICAL_INFUSER:
                    return MekanismConfig.current().usage.chemicalInfuser.val();
                case CHEMICAL_INJECTION_CHAMBER:
                    return MekanismConfig.current().usage.chemicalInjectionChamber.val();
                case ELECTROLYTIC_SEPARATOR:
                    return MekanismConfig.current().general.FROM_H2.val() * 2;
                case PRECISION_SAWMILL:
                    return MekanismConfig.current().usage.precisionSawmill.val();
                case CHEMICAL_DISSOLUTION_CHAMBER:
                    return MekanismConfig.current().usage.chemicalDissolutionChamber.val();
                case CHEMICAL_WASHER:
                    return MekanismConfig.current().usage.chemicalWasher.val();
                case CHEMICAL_CRYSTALLIZER:
                    return MekanismConfig.current().usage.chemicalCrystallizer.val();
                case SEISMIC_VIBRATOR:
                    return MekanismConfig.current().usage.seismicVibrator.val();
                case PRESSURIZED_REACTION_CHAMBER:
                    return MekanismConfig.current().usage.pressurizedReactionBase.val();
                case FLUID_TANK:
                    return 0;
                case FLUIDIC_PLENISHER:
                    return MekanismConfig.current().usage.fluidicPlenisher.val();
                case LASER:
                    return MekanismConfig.current().usage.laser.val();
                case LASER_AMPLIFIER:
                    return 0;
                case LASER_TRACTOR_BEAM:
                    return 0;
                case QUANTUM_ENTANGLOPORTER:
                    return 0;
                case SOLAR_NEUTRON_ACTIVATOR:
                    return 0;
                case RESISTIVE_HEATER:
                    return 100;
                case FORMULAIC_ASSEMBLICATOR:
                    return MekanismConfig.current().usage.formulaicAssemblicator.val();
                default:
                    return 0;
            }
        }

        private double getConfigStorage() {
            switch (this) {
                case ENRICHMENT_CHAMBER:
                    return MekanismConfig.current().storage.enrichmentChamber.val();
                case OSMIUM_COMPRESSOR:
                    return MekanismConfig.current().storage.osmiumCompressor.val();
                case COMBINER:
                    return MekanismConfig.current().storage.combiner.val();
                case CRUSHER:
                    return MekanismConfig.current().storage.crusher.val();
                case DIGITAL_MINER:
                    return MekanismConfig.current().storage.digitalMiner.val();
                case METALLURGIC_INFUSER:
                    return MekanismConfig.current().storage.metallurgicInfuser.val();
                case PURIFICATION_CHAMBER:
                    return MekanismConfig.current().storage.purificationChamber.val();
                case ENERGIZED_SMELTER:
                    return MekanismConfig.current().storage.energizedSmelter.val();
                case TELEPORTER:
                    return MekanismConfig.current().storage.teleporter.val();
                case ELECTRIC_PUMP:
                    return MekanismConfig.current().storage.electricPump.val();
                case CHARGEPAD:
                    return MekanismConfig.current().storage.chargePad.val();
                case ROTARY_CONDENSENTRATOR:
                    return MekanismConfig.current().storage.rotaryCondensentrator.val();
                case CHEMICAL_OXIDIZER:
                    return MekanismConfig.current().storage.oxidationChamber.val();
                case CHEMICAL_INFUSER:
                    return MekanismConfig.current().storage.chemicalInfuser.val();
                case CHEMICAL_INJECTION_CHAMBER:
                    return MekanismConfig.current().storage.chemicalInjectionChamber.val();
                case ELECTROLYTIC_SEPARATOR:
                    return MekanismConfig.current().storage.electrolyticSeparator.val();
                case PRECISION_SAWMILL:
                    return MekanismConfig.current().storage.precisionSawmill.val();
                case CHEMICAL_DISSOLUTION_CHAMBER:
                    return MekanismConfig.current().storage.chemicalDissolutionChamber.val();
                case CHEMICAL_WASHER:
                    return MekanismConfig.current().storage.chemicalWasher.val();
                case CHEMICAL_CRYSTALLIZER:
                    return MekanismConfig.current().storage.chemicalCrystallizer.val();
                case SEISMIC_VIBRATOR:
                    return MekanismConfig.current().storage.seismicVibrator.val();
                case PRESSURIZED_REACTION_CHAMBER:
                    return MekanismConfig.current().storage.pressurizedReactionBase.val();
                case FLUIDIC_PLENISHER:
                    return MekanismConfig.current().storage.fluidicPlenisher.val();
                case LASER:
                    return MekanismConfig.current().storage.laser.val();
                case FORMULAIC_ASSEMBLICATOR:
                    return MekanismConfig.current().storage.formulaicAssemblicator.val();
                default:
                    return 400 * getUsage();
            }
        }

        public double getStorage() {
            return Math.max(getConfigStorage(), getUsage());
        }

        public ItemStack getStack() {
            return ItemStack.EMPTY;
        }

        @Override
        public String getName() {
            return name().toLowerCase(Locale.ROOT);
        }

        @Override
        public String toString() {
            return getName();
        }

        public boolean isFactory() {
            return factoryTier != null;
        }
    }

    public static class MachineBlockStateMapper extends StateMapperBase {

        @Nonnull
        @Override
        protected ModelResourceLocation getModelResourceLocation(@Nonnull IBlockState state) {
            Block block = state.getBlock();
            MachineType type = state.getValue(block.getTypeProperty());
            StringBuilder builder = new StringBuilder();
            String nameOverride = null;

            if (block instanceof IBlockActiveTextured) {
                builder.append(activeProperty.getName());
                builder.append("=");
                builder.append(state.getValue(activeProperty));
            }

            if (block instanceof IRotatableBlock) {
                EnumFacing facing = state.getValue(BlockStateFacing.facingProperty);
                if (!((IRotatableBlock) block).canRotateTo(facing)) {
                    facing = EnumFacing.NORTH;
                }
                if (builder.length() > 0) {
                    builder.append(",");
                }
                builder.append(BlockStateFacing.facingProperty.getName());
                builder.append("=");
                builder.append(facing.getName());
            }

            if (type == MachineType.BASIC_FACTORY || type == MachineType.ADVANCED_FACTORY || type == MachineType.ELITE_FACTORY) {
                RecipeType recipe = state.getValue(recipeProperty);
                nameOverride = type.getName() + "_" + recipe.getName();
            }

            if (builder.length() == 0) {
                builder.append("normal");
            }
            ResourceLocation baseLocation = new ResourceLocation(Mekanism.MODID, nameOverride != null ? nameOverride : type.getName());
            return new ModelResourceLocation(baseLocation, builder.toString());
        }
    }
}