package com.example.travelagency1.converter;

import com.example.travelagency1.dto.SecurityRulesDto;
import com.example.travelagency1.entity.SecurityRules;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Component;
// TODO - implement
@Component
public class SecurityRulesConverter implements Converter<SecurityRules, SecurityRulesDto> {
    @Override
    public SecurityRulesDto fromEntityToDto(SecurityRules entity) {
        //TODO

        return null;
    }

    @Override
    public SecurityRules fromDtoToEntity(SecurityRulesDto dto) {
        //TODO
        return null;
    }
}
