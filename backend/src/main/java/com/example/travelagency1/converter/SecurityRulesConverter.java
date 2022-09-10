package com.example.travelagency1.converter;

import com.example.travelagency1.dto.SecurityRulesDto;
import com.example.travelagency1.entity.SecurityRules;
import org.springframework.stereotype.Component;
// TODO - implement
@Component
public class SecurityRulesConverter implements Converter<SecurityRules, SecurityRulesDto> {
    @Override
    public SecurityRulesDto fromEntityToDto(SecurityRules entity) {

        return new SecurityRulesDto(entity.getId(),entity.getTravelRes(), entity.getInsurance());
    }

    @Override
    public SecurityRules fromDtoToEntity(SecurityRulesDto dto) {

        return new SecurityRules(dto.id(),dto.travelRes(), dto.insurance());
    }
}
