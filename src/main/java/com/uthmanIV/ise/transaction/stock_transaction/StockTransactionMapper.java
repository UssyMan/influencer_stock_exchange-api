package com.uthmanIV.ise.transaction.stock_transaction;

import com.uthmanIV.ise.stock.StockService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = StockService.class)
public interface StockTransactionMapper {

    @Mapping(source = "stock.influencer", target = "stockSymbol", qualifiedByName = "stockSymbolFromInfluencer")
    StockTransactionDto toDto(StockTransaction stockTransaction);

    List<StockTransactionDto> toDtoList(List<StockTransaction> stockTransactions);
}
