package gregicality.science.loaders.recipe;

import gregicality.science.api.recipes.GCYSRecipeMaps;
import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class BoulesRecipes {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(RecipeMaps.BLAST_RECIPES, OreDictUnifier.get(OrePrefix.dust, Silicon, 32), OreDictUnifier.get(dustSmall, GalliumArsenide, 4),
                IntCircuitIngredient.getIntegratedCircuit(2));

        GTRecipeHandler.removeRecipesByInputs(RecipeMaps.BLAST_RECIPES,
                new ItemStack[]{OreDictUnifier.get(OrePrefix.dust, Silicon, 64),
                        OreDictUnifier.get(dustSmall, GalliumArsenide, 2),
                        OreDictUnifier.get(dust, Phosphorus, 8), IntCircuitIngredient.getIntegratedCircuit(2)},
                new FluidStack[]{Nitrogen.getFluid(8000)}
                );

        GTRecipeHandler.removeRecipesByInputs(RecipeMaps.BLAST_RECIPES,
                new ItemStack[]{OreDictUnifier.get(block, Silicon, 16),
                        OreDictUnifier.get(dust, GalliumArsenide, 1),
                        OreDictUnifier.get(ingot, Naquadah, 1)},
                new FluidStack[]{Argon.getFluid(8000)}
        );

        GCYSRecipeMaps.CZPULLER_RECIPES.recipeBuilder().blastFurnaceTemp(1800)
                .input(dust, Silicon, 64)
                .input(dust, GalliumArsenide, 4)
                .fluidInputs(Nitrogen.getFluid(1000))
                .output(SILICON_BOULE).duration(500).EUt(VA[LV]).buildAndRegister();

        GCYSRecipeMaps.CZPULLER_RECIPES.recipeBuilder().blastFurnaceTemp(3200)
                .input(ingot, Silicon, 64)
                .input(ingot, Silicon, 64)
                .input(ingot, Silicon, 64)
                .input(dust, Phosphorus, 64)
                .input(dust, GalliumArsenide, 32)
                .fluidInputs(Redstone.getFluid(32000))
                .output(PHOSPHORUS_BOULE, 2)
                .duration(1000).EUt(VA[HV]).buildAndRegister();

        GCYSRecipeMaps.CZPULLER_RECIPES.recipeBuilder().blastFurnaceTemp(7000)
                .input(block, Silicon, 64)
                .input(block, Silicon, 64)
                .input(block, Naquadah, 16)
                .input(block, GalliumArsenide, 4)
                .fluidInputs(Xenon.getFluid(64000))
                .fluidInputs(Argon.getFluid(128000))
                .output(NAQUADAH_BOULE, 4)
                .duration(2000).EUt(VA[LuV]).buildAndRegister();
    }
}
