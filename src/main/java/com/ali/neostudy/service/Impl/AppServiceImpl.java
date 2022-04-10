package com.ali.neostudy.service.Impl;

import com.ali.neostudy.dto.CalcDto;
import com.ali.neostudy.entity.CalcEntity;
import com.ali.neostudy.service.AppService;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public CalcDto addition(CalcEntity entity) {
        CalcDto response = new CalcDto();
        response.setResponse(entity.getFirstNumber() + entity.getSecondNumber());
        return response;
    }

    @Override
    public CalcDto subtraction(CalcEntity entity) {
        CalcDto response = new CalcDto();
        response.setResponse(entity.getFirstNumber() - entity.getSecondNumber());
        return response;
    }

    @Override
    public CalcDto multiplication(CalcEntity entity) {
        CalcDto response = new CalcDto();
        response.setResponse(entity.getFirstNumber() * entity.getSecondNumber());
        return response;
    }

    @Override
    public CalcDto division(CalcEntity entity) {
        CalcDto response = new CalcDto();
        if (entity.getSecondNumber() != 0) {
            response.setResponse(entity.getFirstNumber() / entity.getSecondNumber());
        } else {
            response.setResponse(0d);
        }
        return response;
    }
}
