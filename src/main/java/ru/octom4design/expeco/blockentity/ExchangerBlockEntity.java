package ru.octom4design.expeco.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import ru.octom4design.expeco.ExpEco;

public class ExchangerBlockEntity extends BlockEntity {
    public ExchangerBlockEntity(BlockPos pos, BlockState state) {
        super(ExpEco.exchangerBlockEntity, pos, state);
    }
}
